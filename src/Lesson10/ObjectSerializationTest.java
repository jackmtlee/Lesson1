package Lesson10;


import java.io.*;

// Clonable interface for deep copy
class Student implements Serializable
{
    private String id;
    private String name;
    public Student(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {return "id = " + id + ", name = " + name;}

}



public class ObjectSerializationTest {

    public static void main(String[] args) throws Exception
    {
//        Student s1 = new Student("1", "Tom");
//        Student s2 = new Student("2", "Jerry");
//
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
//
//
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.close();


        readStudent();
    }


    static void readStudent() throws Exception
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));


        Student s1 = (Student)(ois.readObject());

        System.out.println(s1);

    }
}
