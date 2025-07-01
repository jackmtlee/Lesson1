import java.awt.event.ComponentListener;


class Test
{
    final static int NUMBER = 1024;
    final int number = 1;
    final String s = "java";
    final StringBuffer sb = new StringBuffer("java");

    public void fn()
    {
//        s = s + "hello";       // error
        sb.append("hello");    // OK
    }
}
