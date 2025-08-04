package Lesson9;

import java.io.Serializable;
import java.util.*;

public class Student implements Cloneable, Serializable {
    private String id;
    private String name;

    public Student() {}
    public Student(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getID() { return id; }
    public String getName() { return name; }
    public int hashCode() {return id.hashCode();}
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Student)) return false;
        Student stu = (Student)obj;
        if(this.id.equals(stu.id)) return true;
        else return false;
    }

    private static void hashset() throws Exception
    {
        HashSet hs = new HashSet();
        hs.add(new Student("1", "Tom"));
        hs.add(new Student("2", "Jerry"));
        hs.add(new Student("1", "Tom"));
        Iterator iterator = hs.iterator();
        while (iterator.hasNext())
        {
            Student s = (Student) iterator.next();
            System.out.println("id = " + s.getID() + " name = " + s.getName() + " hashcode = " + s.hashCode());
            System.out.println("info without overriding toString(): " + s.toString());

            Student copy = (Student)(s.clone());
        }
    }

    public static void main(String[] args) throws Exception {
        hashset();
    }
}




