package Lesson9;

import java.util.*;

class Employee{
    private String name;
    public String getName() {return this.name;}
}
class Manager extends Employee{}
class Intern extends Employee{}

public class WildcardTest
{
    public static void printNames(List<? extends Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }

    public static void addEmployees(List<? super Employee> list) {
        list.add(new Manager());
        list.add(new Intern());
    }


    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<>();
        List<Manager> managerList = new ArrayList<>();
        List<Intern> internList = new ArrayList<>();

        printNames(employeeList);
        printNames(managerList);
        printNames(internList);
    }
}
