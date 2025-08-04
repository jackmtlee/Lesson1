package Lesson9;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);  // Output: Java Programming

        sb.insert(5, "is fun ");
        System.out.println(sb);  // Output: Java is fun Programming

        sb.replace(5, 12, "rocks");
        System.out.println(sb);  // Output: Java rocks Programming

        sb.delete(5, 11);
        System.out.println(sb);  // Output: Java Programming

        sb.reverse();
        System.out.println(sb);  // Output: gnimmargorP avaJ

        StringBuffer sbb = new StringBuffer();
        System.out.println(sbb.capacity()); // Default is 16
        sbb.ensureCapacity(100);            // Ensures at least 100 chars can be stored
    }
}
