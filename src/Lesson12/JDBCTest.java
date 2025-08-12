package Lesson12;

import java.sql.*;


public class JDBCTest
{
    public static void main(String[] args) throws Exception
    {
//        javaCallOracleStoreProcedure();
//        javaCallOraclePackage();

        javaConnectOracle();
    }

    // execute the public function: get_student_string() from Oracle package first_pkg
    static void javaCallOraclePackage() throws Exception
    {
        // load Oracle driver
        Class.forName("Driver");
        // get connection
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "XXX");
        // call the public function in Oracle package
        String sql_statement = "select first_pkg.get_student_string from dual";
        PreparedStatement pstm = connection.prepareStatement(sql_statement);
        // execute the query
        ResultSet rs = pstm.executeQuery();
        // result output
        while(rs.next()){
            System.out.println("result is : " + rs.getString(1));
        }
        // release the resource
        rs.close();
        pstm.close();
        connection.close();
    }
    //  execute the Oracle PL/SQL stored procedure, and get the results
//    static void javaCallOracleStoreProcedure() throws Exception
//    {
//        // load Oracle driver
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        // get connection
//        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "XXXX");
//        //get statement object
//        String sql = "{call get_student_name(?,?)}";
//        // call store procedure
//        CallableStatement call = connection.prepareCall(sql);
//        // set the input parameter
//        call.setString(1,"001");
//        // register the output parameter
//        call.registerOutParameter(2, OracleTypes.VARCHAR);
//        // execute the store procedure
//        call.execute();
//        // get the value for the output parameter
//        String studentName = call.getString(2);
//        System.out.println("student name is " + studentName);
//        call.close();
//        connection.close();
//    }

    //  execute the regular SQL statement, and get the results
    static void javaConnectOracle() throws Exception
    {
        // load Oracle driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
//
//        System.out.println("Connecting to database...");


        // get connection
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.19:1521:orcl", "TOM", "jackmtlee");
        //get statement object
        String sql_statement = "select * from T_STUDENT";
        PreparedStatement pstm = connection.prepareStatement(sql_statement);

//        System.out.println("Connecting to database...");

        // assign the values to the parameters
//        pstm.setObject(1, 1);
        // execute the query
        ResultSet rs = pstm.executeQuery();

        System.out.println("Connecting to database...");

        // result output
        while(rs.next()){
                System.out.println("student id : " + rs.getString("S_ID") + ", student name is : " + rs.getString("S_NAME") + ", age is " + rs.getString("S_AGE"));
        }
        // release the resource
        rs.close();
        pstm.close();
        connection.close();
    }
}
