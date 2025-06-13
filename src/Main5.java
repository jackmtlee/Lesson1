public class Main5
{
    public Main5()
    {
        System.out.println("default constructor");
    }
    public Main5(int first)
    {
        this();
        System.out.println("constructor with one parameter");
    }

    public static void main(String[] args)
    {
//        int[] arr = new int[10];
//        arr[10] = 10;
        new Main5(5);
    }
}
