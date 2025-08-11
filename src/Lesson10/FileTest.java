package Lesson10;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("example.txt");

        // absolute path under Window OS
        File file = new File("D:\\IntelliJ Idea Project\\your file.docx");

        // for Linux, you must change the backslash to slash
//        File file = new File("//IntelliJ Idea Project");

        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

//        fn();

        fn1();

    }

    static void fn() throws IOException
    {
        // relative path
        File file = new File("newfile.txt");

        if (file.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists.");
        }

//        file.delete(); // Deletes the file
    }

    static void fn1()
    {
        File dir = new File("myfolder");

        if (!dir.exists()) {
            dir.mkdir();
        }

        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }

    }
}
