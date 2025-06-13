public class ForStatement
{
    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number/2; ++i)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        for(int i = 100; i < 1000; ++i)
        {
            if(isPrime(i))
                System.out.println(i + " is a prime number");
        }
    }
}
