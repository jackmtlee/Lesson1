package midterm;

// Level 1 interface
interface Person
{
    public abstract String getId();
    public abstract String getName();
}
// Level 2 interfaces
interface Student extends Person
{
    double getGPA();
}
interface Faculty extends Person
{
    double getSalary();
}

class Undergraduate implements Student
{
    private String id;
    private String name;

    public String getId() {return id;}
    public String getName() {return name;}
    public double getGPA(){return 0.0;}

    public String getCapstoneProjectTitle() {return null;}
}
// Level 3: concrete classes
class Graudate implements Student
{
    private String id;
    private String name;

    public String getId() {return id;}
    public String getName() {return name;}
    public double getGPA(){return 0.0;}

    public String getThesisTitle() {return null;}
}

class AssistantProfessor implements Faculty
{
    public String getId() {return null;}
    public String getName() {return null;}
    public double getSalary() {return 0.0;}
}

class AssoicateProfessor implements Faculty
{
    public String getId() {return null;}
    public String getName() {return null;}
    public double getSalary() {return 0.0;}
}

class FullProfessor implements Faculty
{
    public String getId() {return null;}
    public String getName() {return null;}
    public double getSalary() {return 0.0;}
}




public class UniversityMain
{
    public static void main(String[] arags)
    {

    }

}
