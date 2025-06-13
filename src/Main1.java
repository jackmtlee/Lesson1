class Base
{
    public Base() {
        System.out.println("base created");
    }
}

class Derived extends Base
{
    public Derived() {
        System.out.println("derived created");
    }
}

class SubDerived extends Derived
{
    public SubDerived() {
        System.out.println("sub derived created");
    }
}

public class Main1
{
    public static void main(String[] args)
    {
        new Base();
        new Derived();
        new SubDerived();
    }
}
