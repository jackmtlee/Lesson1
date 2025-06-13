class Base3
{
    public Base3(int n) {
        System.out.println("base created");
    }
}
class Derived3 extends Base3
{
    public Derived3(int n) {
        super(n);
        System.out.println("derived created");
    }
}
class SubDerived3 extends Derived3
{
    public SubDerived3(int n) {
        super(n);
        System.out.println("sub derived created");
    }
}
public class Main3
{
    public static void main(String[] args)
    {
        new Base3(1);
        new Derived3(1);
        new SubDerived3(1);
    }
}
