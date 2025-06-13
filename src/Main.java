class Bowl
{
    public Bowl(int number)
    {System.out.println("Bowl " + number);}
}
class Table
{
    static Bowl b1 = new Bowl(1);
    public Table()
    {System.out.println("Table constructor");}
    Bowl b2 = new Bowl(2);
    static Bowl b3 = new Bowl(3);
}
class Cupboard
{
   Bowl b4 = new Bowl(4);
   static Bowl b5 = new Bowl(5);
   public Cupboard()
   {System.out.println("Cupboard constructor");}
}
public class Main
{
    public static void main(String[] args)
    {
        new Cupboard();
        new Table();
    }
    static Table table = new Table();
    Bowl b7 = new Bowl(7);

    static
    {
        Bowl b6 = new Bowl(6);
    }

    static Bowl b8 = new Bowl(8);
}