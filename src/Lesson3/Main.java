package Lesson3;

public class Main
{
    final static int NUMBER = 1024;
    final String s = "java";
    final StringBuffer sb = new StringBuffer("java");

    public void fn()
    {
//        s = s + "hello";       // error
        sb.append("hello");    // OK
//        NUMBER ++;             // error
    }


    public static void main(String[] args)
    {
        new Main().fn();
    }
}
