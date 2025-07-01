package Lesson3;


class Employee
{
    private String name;
    private int salary;
    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

public class Main2
{
    public static void main(String[] args)
    {
        Object obj = new Employee("Harry Hacker", 35000);
        Employee e = (Employee) obj;

    }
}
