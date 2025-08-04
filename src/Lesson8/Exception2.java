package Lesson8;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");

        try
        {
            int number = scanner.nextInt();    // throws an exception
        }

        catch(InputMismatchException e)
        {

            e.printStackTrace();   // show the error trace

//            System.out.println("the reason is : " + e.getMessage());

//            System.out.println("you never see me if you input an integer");
//            System.out.println("an integer is required");
        }

        catch(Exception e)
        {
            System.out.println("can handle all the exceptions");
        }

    }
}