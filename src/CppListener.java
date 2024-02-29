// Generated from ./src/Cpp.g4 by ANTLR 4.13.1

import java.lang.Math;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppParser}.
 */
public interface CppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CppParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CppParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#outer_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterOuter_statement_list(CppParser.Outer_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#outer_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitOuter_statement_list(CppParser.Outer_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#outer_statement}.
	 * @param ctx the parse tree
	 */
	void enterOuter_statement(CppParser.Outer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#outer_statement}.
	 * @param ctx the parse tree
	 */
	void exitOuter_statement(CppParser.Outer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(CppParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(CppParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CppParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CppParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(CppParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(CppParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(CppParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(CppParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(CppParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(CppParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(CppParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(CppParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(CppParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(CppParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(CppParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(CppParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(CppParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(CppParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(CppParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(CppParser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CppParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(CppParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(CppParser.Direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(CppParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(CppParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(CppParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(CppParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CppParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CppParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(CppParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(CppParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CppParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CppParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#type_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier_list(CppParser.Type_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier_list(CppParser.Type_qualifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(CppParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(CppParser.Declaration_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(CppParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(CppParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specifier(CppParser.Function_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specifier(CppParser.Function_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CppParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CppParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(CppParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(CppParser.Storage_class_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#assigment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssigment_expression(CppParser.Assigment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#assigment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssigment_expression(CppParser.Assigment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(CppParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(CppParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(CppParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(CppParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(CppParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(CppParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CppParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CppParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CppParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CppParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(CppParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(CppParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CppParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CppParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(CppParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(CppParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(CppParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(CppParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CppParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CppParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#floating_constant}.
	 * @param ctx the parse tree
	 */
	void enterFloating_constant(CppParser.Floating_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#floating_constant}.
	 * @param ctx the parse tree
	 */
	void exitFloating_constant(CppParser.Floating_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_constant(CppParser.Character_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#character_constant}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_constant(CppParser.Character_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void enterInteger_constant(CppParser.Integer_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#integer_constant}.
	 * @param ctx the parse tree
	 */
	void exitInteger_constant(CppParser.Integer_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CppParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CppParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(CppParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(CppParser.Argument_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#argument_expression}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression(CppParser.Argument_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#argument_expression}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression(CppParser.Argument_expressionContext ctx);
}