public class Person {
    private String name;
    private int age;
    private String city;

    // 1) No-arg constructor
    public Person() {
        this.name = "Unknown";
        this.age  = 0;
        this.city = "Unknown";
    }

    // 2) Constructor with name only
    public Person(String name) {
        this.name = name;
        this.age  = 0;
        this.city = "Unknown";
    }

    // 3) Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
        this.city = "Unknown";
    }

    // 4) Constructor with name, age, and city
    public Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d, city='%s'}",
                name, age, city);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("Bob", 30);
        Person p4 = new Person("Carol", 25, "Seattle");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
