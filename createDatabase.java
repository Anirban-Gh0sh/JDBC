import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class JDBC
{
    /*Steps to connect with DB and perform operations 
       1.Load driver
       2.create connection
       3.create statement
       4.execute query
       5.close connection*/
    public void createDB()
    {
        try
        {
             String url="jdbc:mysql://localhost:3306/";
             String userName="root";
             String password="Anirban@123";
                
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection(url,userName,password);
             Statement stmt=con.createStatement();
             stmt.executeUpdate("CREATE DATABASE STUDENT;");  
             System.out.println("Successful");
             con.close();
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        JDBC jd=new JDBC();
        jd.createDB();
    }
}
