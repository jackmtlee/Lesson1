class Message
{
    public void printMsg(String msg)
    {System.out.println(msg);}
}



// Web project, table Student (sid, sname, gender)

public class Student
{

    private String sid;
    private String sname;
    private String gender;

    public Student(String sid, String sname, String gender)
    {
        this.sid = sid;   // true
        this.sname = sname;
        this.gender = gender;
    }


    public static void main(String[] args)
    {
        Message msg1 = new Message();
        Message msg2 = new Message();
        msg1.printMsg("Hello");
        msg2.printMsg("Hello");
    }
}
