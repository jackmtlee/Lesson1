package Lesson10;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }

    static void fn() throws IOException
    {
        File file = new File("newfile.txt");

        if (file.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists.");
        }

        file.delete(); // Deletes the file
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
