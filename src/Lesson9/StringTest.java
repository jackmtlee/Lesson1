package Lesson9;


public class StringTest {
    public static void main(String[] args) {
        String s = "I";
        System.out.println(s);      // I
        System.out.println(s.hashCode());

        s = s + " Love ";
        System.out.println(s);   // I love
        System.out.println(s.hashCode());

        s = s + " Java ";       //  I love Java
        System.out.println(s);
        System.out.println(s.hashCode());


        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.append("world");

        System.out.println(sb);
        System.out.println(sb.hashCode());





        System.out.println(s.length());  // Output: 5

        System.out.println(s.charAt(1)); // Output: 'e'

        System.out.println(s.substring(0, 4)); // Output: "Hell"

        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);         // false
        System.out.println(a.equals(b));    // true

        System.out.println("Hello".toLowerCase()); // "hello"
        System.out.println("Hello".toUpperCase()); // "HELLO"

        String messy = "   Java   ";
        System.out.println(messy.trim()); // "Java"

        System.out.println("Hello World".contains("World")); // true

        System.out.println("car".replace('c', 'b')); // "bar"

        String data = "apple,banana,orange";
        String[] fruits = data.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Output:
        // apple
        // banana
        // orange
    }
}
