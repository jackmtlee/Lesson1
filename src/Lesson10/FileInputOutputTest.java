package Lesson10;

import java.io.*;

public class FileInputOutputTest
{
    // DO NOT skip the exceptions
    public static void main(String [] args) throws IOException
    {
//        fn();
        fn1();
    }


    private static void fn() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "write sth to the file";
        fos.write(data.getBytes());
        System.out.print("completed");


        FileInputStream fis = new FileInputStream("output.txt");
        int sth;
        while((sth = fis.read()) != -1)
        {
            System.out.print((char)sth);
        }
    }

    private static void fn1() throws IOException
    {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String data = "write sth to the file using BufferedOutputStream";
        bos.write(data.getBytes());
        bos.flush();    // force to write the data (in the buffer) to the file
        System.out.print("completed");
    }


}
