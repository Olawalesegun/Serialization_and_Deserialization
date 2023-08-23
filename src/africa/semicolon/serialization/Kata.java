package africa.semicolon.serialization;

import java.io.IOException;
import java.io.PrintStream;

public class Kata {

    public static void main(String[] args) {
        try(PrintStream printStream = new PrintStream("/home/user/Documents/jToJson/src/africa/semicolon/serialization/output.txt")){
            System.setOut(printStream);
            System.out.println("Writing to a file");
            System.out.println(printStream);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
