package Lesson9;

public class ClassTest {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");

        System.out.println("Class Name: " + cls.getName());
        System.out.println("Superclass: " + cls.getSuperclass().getName());

        System.out.println("\nMethods:");
        for (var method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        System.out.println("\nFields:");
        for (var field : cls.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }
}
