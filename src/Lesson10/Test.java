package Lesson10;
import java.io.*;

public class Test {
}




class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("input.txt"), "UTF-8")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}

class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8")) {
            writer.write("こんにちは (Hello in Japanese)");
        }
    }
}


//BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "UTF-8"));
//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8"));

