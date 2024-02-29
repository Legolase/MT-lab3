import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("""
                                Invalid number of arguements!
                                program <path-to-input-file> <path-to-output-file>
                                """);
        }
        try {
            ANTLRFileStream fileStream = new ANTLRFileStream(args[0]);
            CppLexer lexer = new CppLexer(fileStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            CppParser parser = new CppParser(tokenStream);

            String result = parser.program().code;

            FileWriter writer = new FileWriter(args[1]);
            writer.write(result);
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
