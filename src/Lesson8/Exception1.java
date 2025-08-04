package Lesson8;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class YourException extends Exception {
    public YourException() {
        super();
    }
}
public class Exception1
{
    public void fn1() throws SQLException
    {}
    public void fn2() throws FileNotFoundException
    {}
    public void fn3() throws YourException
    {}
}
