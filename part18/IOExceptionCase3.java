package part18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {
    public static void main(String[]args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //IOException 예외 넘긴다고 명시
    public static void md1()throws IOException {
        md2();
    }
    public static void md2() throws IOException { // IOException 예외 넘긴다고 명시 !

        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
            writer = Files.newBufferedWriter(file); //IOException 발생 가능
            writer.write('A'); // IOException 발생 가능
            writer.write('Z'); // IOException 발생 가능

            if(writer != null)
            writer.close(); // IOException 발생 가능
        }
}

