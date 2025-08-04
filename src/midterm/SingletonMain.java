package midterm;

/**
 *  key points for a singleton pattern
 *  1. constructor must be private
 *  2. static method must be available to get an instance outside
 *  3. this is multi-thread unsafe version
 */
class Singleton
{
    private static Singleton instance = null;
    private Singleton()
    {
        System.out.println("Creating a singleton");
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

public class SingletonMain
{
    public static void main(String[] args)
    {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("hashocde of instance1 is " + instance1.hashCode());

        Singleton instance2 = Singleton.getInstance();
        System.out.println("hashocde of instance2 is " + instance1.hashCode());

    }
}
