public class Main6
{

    // constroctuor with one parameter
    public Main6(int para1)
    {
        System.out.println("constroctuor with one parameter");
    }




    static double add(double a, double b)
    {
        return a + b;
    }


    // there is no default constructor.
    public static void main(String[] args)
    {

        add(3, 4);

        new Main6(6);
//        new Main6();
    }
}
