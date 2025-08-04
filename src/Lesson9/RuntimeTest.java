package Lesson9;

public class RuntimeTest {
    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad.exe");
    }
}
