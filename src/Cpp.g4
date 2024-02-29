grammar Cpp;

@header {
import java.lang.Math;
}

program returns [String code]
    : outer_statement_list[0] { $code = $outer_statement_list.code; } EOF
    ;

outer_statement_list[int indent] returns [String code]
    : outer_statement[indent] { $code = $outer_statement.code + '\n'; }
    | outer_statement[indent] outer_statement_list[indent] { $code = $outer_statement.code + '\n' + $outer_statement_list.code; }
    ;

outer_statement[int indent] returns [String code]
    @init {
        String TAB = "  ".repeat($indent);
    }
    : declaration_statement[indent] { $code = TAB + $declaration_statement.code + ";"; }
    | function_statement[indent] { $code = $function_statement.code; }
    ;

function_statement[int indent] returns [String code]
    @init {
        String TAB = "  ".repeat($indent);
    }
    : declaration_specifiers[indent] declarator[indent] LFIGURE statement_list[indent + 1] RFIGURE
        {
            $code = TAB + $declaration_specifiers.code + ' ' + $declarator.code + " {\n" + $statement_list.code + TAB + '}';
        }
    ;

statement_list[int indent] returns [String code]
    @init {
        $code = "";
    }
    : (statement[indent, false] { $code = $statement.code + "\n"; })?
    | statement[indent, false] statement_list[indent] { $code = $statement.code + "\n" + $statement_list.code; }
    ;

statement[int indent, boolean leftShift] returns [String code]
    @init {
        String TAB = "  ".repeat($indent);
    }
    : expression_statement { $code = TAB + $expression_statement.code + ";"; }
    | declaration_statement[indent] { $code = TAB + $declaration_statement.code + ";"; }
    | selection_statement[indent] { $code = $selection_statement.code; }
    | iteration_statement[indent] { $code = $iteration_statement.code; }
    | jump_statement PZAP { $code = TAB + $jump_statement.code + ";"; }
    | block_statement[indent, leftShift] { $code = $block_statement.code; }
    ;

selection_statement[int indent] returns [String code]
    @init {
        String TAB = "  ".repeat($indent);
    }
    : IF LPAREL expression RPAREL statement[indent + 1, true] { $code = TAB + "if (" + $expression.code + ")\n" + $statement.code; }
    | IF LPAREL expression RPAREL yes=statement[indent + 1, true] ELSE no=statement[indent + 1, true] { $code = TAB + "if (" + $expression.code + ")\n" + $yes.code + "\n" +TAB + "else\n" + $no.code; }
    ;

block_statement[int indent, boolean leftShift] returns [String code]
    @init {
        if ($leftShift) {
            --$indent;
        }
        String TAB = "  ".repeat($indent);
    }
    : LFIGURE statement_list[$indent + 1] RFIGURE { $code = TAB + "{\n" + $statement_list.code + TAB + "}"; }
    ;

expression_statement returns [String code]
    : PZAP { $code = ";"; }
    | expression PZAP { $code = $expression.code; }
    ;

iteration_statement[int indent] returns [String code]
    @init {
        $code = "";
        String TAB = "  ".repeat($indent);
    }
    : WHILE LPAREL expression RPAREL statement[indent + 1, true] { $code = TAB + "while (" + $expression.code + ")\n" + $statement.code; }
    | DO statement[indent + 1, true] WHILE LPAREL expression RPAREL PZAP { $code = TAB + "do\n" + $statement.code + "while (" + $expression.code + ");"; }
    | FOR LPAREL { $code += TAB + "for ("; }
      (expr1=expression { $code += $expr1.code; })?
      PZAP { $code += "; "; }
      (expr2=expression { $code += $expr2.code; })?
      PZAP { $code += "; "; }
      (expr3=expression { $code += $expr3.code; })? RPAREL statement[indent + 1, true] { $code += ")\n" + $statement.code; }
    ;

jump_statement returns [String code]
    @init {
        $code = "";
    }
    : GOTO identifier { $code = "goto " + $identifier.code; }
    | CONTINUE { $code = "continue"; }
    | BREAK { $code = "break"; }
    | RETURN { $code += "return"; } (expression { $code += " " + $expression.code; })?
    ;

declaration_statement[int indent] returns [String code]
    @init {
        $code = "";
    }
    : declaration_specifiers[indent] { $code += $declaration_specifiers.code; }
      (init_declarator_list[indent] { $code += " " + $init_declarator_list.code; })? PZAP
    ;

init_declarator_list[int indent] returns [String code]
    : init_declarator[indent] { $code = $init_declarator.code ; }
    | init_declarator[indent] ZAP init_declarator_list[indent] { $code = $init_declarator.code + ", " + $init_declarator_list.code ; }
    ;

init_declarator[int indent] returns [String code]
    @init {
        $code = "";
    }
    : declarator[indent] { $code += $declarator.code; } (ASSING initializer { $code += " = " + $initializer.code; })?
    ;

declarator[int indent] returns [String code]
    @init {
        $code = "";
    }
    : (pointer { $code += $pointer.code; })? direct_declarator[indent] { $code += $direct_declarator.code; }
    ;

direct_declarator[int indent] returns [String code]
    @init {
        $code = "";
    }
    : identifier { $code = $identifier.code; }
    | identifier LPAREL { $code += $identifier.code + "("; }
      (parameter_list[indent] { $code += $parameter_list.code; })? RPAREL { $code += ")"; }
    ;

parameter_list[int indent] returns [String code]
    : parameter_declaration[indent] { $code = $parameter_declaration.code; }
      (ZAP parameter_list[indent] { $code += ", " + $parameter_list.code; })?
    ;

parameter_declaration[int indent] returns [String code]
    : declaration_specifiers[indent] declarator[indent] { $code = $declaration_specifiers.code + " " + $declarator.code; }
    ;

initializer returns [String code]
    : assigment_expression { $code = $assigment_expression.code; }
    | LFIGURE initializer_list RFIGURE { $code = "{ " + $initializer_list.code + " }"; }
    ;

initializer_list returns [String code]
    : initializer { $code = $initializer.code; }
    | initializer ZAP initializer_list { $code = $initializer.code + ", " + $initializer_list.code; }
    ;

pointer returns [String code]
    : MULT { $code = "*"; }
      (type_qualifier_list { $code += $type_qualifier_list.code + " "; })?
      (pointer { $code += $pointer.code; })?
    ;

type_qualifier_list returns [String code]
    : type_qualifier { $code = $type_qualifier.code; }
    | type_qualifier type_qualifier_list { $code = $type_qualifier.code + $type_qualifier_list.code; }
    ;

declaration_specifiers[int indent] returns [String code]
    : storage_class_specifier declaration_specifiers[indent] { $code = $storage_class_specifier.code + " " + $declaration_specifiers.code; }
    | type_specifier[indent] { $code = $type_specifier.code; }
      (type_qualifier { $code += " " + $type_qualifier.code; })?
    | type_qualifier { $code = $type_qualifier.code; }
    | function_specifier { $code = $function_specifier.code; }
    ;

type_qualifier returns [String code]
    : CONST { $code = $CONST.text; }
    | VOLATILE { $code = $VOLATILE.text; }
    ;

function_specifier returns [String code]
    : INLINE { $code = $INLINE.text; }
    ;

type_specifier[int indent] returns [String code]
    @init {
        String TAB = "  ".repeat($indent);
    }
    : base_type=(VOID | CHAR | INT | LONG | DOUBLE | FLOAT) { $code = $base_type.text; }
    | VALID_NAME { $code = $VALID_NAME.text; }
    | struct_class=(STRUCT | CLASS) { $code = $struct_class.text; }
      (VALID_NAME { $code += " " + $VALID_NAME.text; })?
      LFIGURE outer_statement_list[indent + 1] RFIGURE { $code += " {\n" + $outer_statement_list.code + TAB + "}"; }
    ;

storage_class_specifier returns [String code]
    : specifier=(AUTO | STATIC | TYPEDEF) { $code = $specifier.text; }
    ;

expression returns [String code]
    : assigment_expression { $code = $assigment_expression.code; }
    ;

assigment_expression returns [String code]
    : logical_or_expression { $code = $logical_or_expression.code; }
    | ue=unary_expression ASSING ae=assigment_expression { $code = $ue.code + " " + $ASSING.text + " " + $ae.code; }
    | ue=unary_expression PLUSA ae=assigment_expression { $code = $ue.code + " " + $PLUSA.text + " " + $ae.code; }
    | ue=unary_expression MUNUSA ae=assigment_expression { $code = $ue.code + " " + $MUNUSA.text + " " + $ae.code; }
    | ue=unary_expression MULTA ae=assigment_expression { $code = $ue.code + " " + $MULTA.text + " " + $ae.code; }
    | ue=unary_expression DIVA ae=assigment_expression { $code = $ue.code + " " + $DIVA.text + " " + $ae.code; }
    | ue=unary_expression MODA ae=assigment_expression { $code = $ue.code + " " + $MODA.text + " " + $ae.code; }
    ;

logical_or_expression returns [String code]
    : le1=logical_or_expression OR le2=logical_and_expression { $code = $le1.code + " " + $OR.text + " " + $le2.code; }
    | logical_and_expression { $code = $logical_and_expression.code; }
    ;

logical_and_expression returns [String code]
    : le1=logical_and_expression AND le2=equality_expression { $code = $le1.code + " " + $AND.text + " " + $le2.code; }
    | equality_expression { $code = $equality_expression.code; }
    ;

equality_expression returns [String code]
    : relational_expression { $code = $relational_expression.code; }
    | re=relational_expression EQ ee=equality_expression { $code = $re.code + " " + $EQ.text + " " + $ee.code; }
    | re=relational_expression NE ee=equality_expression { $code = $re.code + " " + $NE.text + " " + $ee.code; }
    ;

relational_expression returns [String code]
    : additive_expression { $code = $additive_expression.code; }
    | ae=additive_expression GR re=relational_expression { $code = $ae.code + " " + $GR.text + " " + $re.code; }
    | ae=additive_expression LS re=relational_expression { $code = $ae.code + " " + $LS.text + " " + $re.code; }
    | ae=additive_expression NGR re=relational_expression { $code = $ae.code + " " + $NGR.text + " " + $re.code; }
    | ae=additive_expression NLS re=relational_expression { $code = $ae.code + " " + $NLS.text + " " + $re.code; }
    ;

additive_expression returns [String code]
    : me=multiplicative_expression { $code = $me.code; }
    | me=multiplicative_expression PLUS ae=additive_expression { $code = $me.code + " " + $PLUS.text + " " + $ae.code; }
    | me=multiplicative_expression MINUS ae=additive_expression { $code = $me.code + " " + $MINUS.text + " " + $ae.code; }
    ;

multiplicative_expression returns [String code]
    : ue=unary_expression { $code = $ue.code; }
    | ue=unary_expression MULT me=multiplicative_expression { $code = $ue.code + " " + $MULT.text + " " + $me.code; }
    | ue=unary_expression DIV me=multiplicative_expression { $code = $ue.code + " " + $DIV.text + " " + $me.code; }
    | ue=unary_expression MOD me=multiplicative_expression { $code = $ue.code + " " + $MOD.text + " " + $me.code; }
    ;

unary_expression returns [String code]
    : postfix_expression { $code = $postfix_expression.code; }
    | INCR unary_expression { $code = $INCR.text + $unary_expression.code; }
    | DECR unary_expression { $code = $DECR.text + $unary_expression.code; }
    | NOT unary_expression { $code = $NOT.text + $unary_expression.code; }
    | pref=(PLUS | MINUS | MULT | AMPER) me=multiplicative_expression { $code = $pref.text + $me.code; }
    ;

postfix_expression returns [String code]
    : primary_expression { $code = $primary_expression.code; }
    | pe=postfix_expression LBOX expression RBOX { $code = $pe.code + $LBOX.text + $expression.code + $RBOX.text; }
    | pe=postfix_expression LPAREL { $code = $pe.code + $LPAREL.text; }
      (ael=argument_expression_list { $code += $ael.code; })? RPAREL { $code += $RPAREL.text; }
    | pe=postfix_expression DOT identifier { $code = $pe.code + $DOT.text + $identifier.code; }
    | pe=postfix_expression ARROW identifier { $code = $pe.code + $ARROW.text + $identifier.code; }
    ;

primary_expression returns [String code]
    : identifier { $code = $identifier.code; }
    | constant { $code = $constant.code; }
    | LITERAL { $code = $LITERAL.text; }
    | LPAREL expression RPAREL { $code = $LPAREL.text + $expression.code + $RPAREL.text; }
    ;

constant returns [String code]
    : integer_constant { $code = $integer_constant.code; }
    | floating_constant { $code = $floating_constant.code; }
    | character_constant { $code = $character_constant.code; }
    ;

floating_constant returns [String code]
    : NUMBER DOT NUMBER { $code = $NUMBER.text + $DOT.text + $NUMBER.text; }
    ;

character_constant returns [String code]
    : LITERAL { $code = $LITERAL.text; }
    ;

integer_constant returns [String code]
    : NUMBER { $code = $NUMBER.text; }
    ;

identifier returns [String code]
    : VALID_NAME { $code = $VALID_NAME.text; }
    ;

argument_expression_list returns [String code]
    : argument_expression { $code = $argument_expression.code; }
    | ae=argument_expression ZAP ael=argument_expression_list { $code = $ae.code + ", " + $ael.code; }
    ;

argument_expression returns [String code]
    : expression { $code = $expression.code; }
    ;

VOLATILE: 'volatile';
CONTINUE: 'continue';
TYPEDEF:  'typedef';
STRUCT:   'struct';
STATIC:   'static';
DOUBLE:   'double';
INLINE:   'inline';
RETURN:   'return';
FLOAT:    'float';
CLASS:    'class';
WHILE:    'while';
CONST:    'const';
BREAK:    'break';
AUTO:     'auto';
VOID:     'void';
CHAR:     'char';
LONG:     'long';
GOTO:     'goto';
ELSE:     'else';
INT:      'int';
FOR:      'for';
DO:       'do';
IF:       'if';

LITERAL: '"' (ESC | ~["\\])* '"' ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

VALID_NAME: [a-zA-Z][a-zA-Z_0-9]*;

NUMBER: (PLUS | MINUS)? ([0] | [1-9][0-9]*);

INCR:    '++';
DECR:    '--';
ARROW:   '->';
NE:      '!=';
PLUSA:   '+=';
MUNUSA:  '-=';
MULTA:   '*=';
DIVA:    '/=';
MODA:    '%=';
NGR:     '<=';
NLS:     '>=';
AND:     '&&';
OR:      '||';
EQ:      '==';
MULT:    '*';
NOT:     '!';
DIV:     '/';
MOD:     '%';
PLUS:    '+';
MINUS:   '-';
GR:      '>';
LS:      '<';
ASSING:  '=';
AMPER:   '&';
ZAP:     ',';
PZAP:    ';';
LPAREL:  '(';
RPAREL:  ')';
LBOX:    '[';
RBOX:    ']';
LFIGURE: '{';
RFIGURE: '}';
DOT:     '.';


SPACE: [ \t\r\n]+ -> skip;