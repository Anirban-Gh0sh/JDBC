import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.lang.Exception;
import java.sql.*;
import java.util.*;

public class DatabaseEntry
{
    /*Steps to connect with DB and perform operations 
       1.Load driver
       2.create connection
       3.create statement
       4.execute query
       5.close connection*/
    public void insertValueInTable_prepared()
    {
        Scanner in = new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="Anirban@123";
        System.out.print("Enter your registration number : ");
        int REG_NO=in.nextInt();
        System.out.println();
        System.out.print("Enter your  Full Name : ");
        in.nextLine();
        String NAME=in.nextLine();
        System.out.println();
        System.out.print("Enter your Phone Number : ");
        String PHONE_NUMBER=in.nextLine();
        System.out.println();
        System.out.print("Enter your Gender : ");
        char GENDER=in.next().charAt(0);
        System.out.println();
        System.out.print("Enter your City Name : ");
        in.nextLine();
        String CITY=in.nextLine();
        System.out.println();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,userName,password);
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO CSE(REG_NO,NAME,PHONE_NUMBER,GENDER,CITY) VALUES(?,?,?,?,?);");
            
            
            pstmt.setInt(1,REG_NO);
            pstmt.setString(2,NAME);
            pstmt.setString(3,PHONE_NUMBER);
            pstmt.setString(4,String.valueOf(GENDER));
            pstmt.setString(5,CITY);
            
            pstmt.executeUpdate();
            System.out.println("Data Successful Entered");
            System.out.println("------------------------------------------------------------------------");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        DatabaseEntry DBE=new DatabaseEntry();
        DBE.insertValueInTable_prepared();
    }
}
