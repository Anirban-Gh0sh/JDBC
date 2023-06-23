import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.lang.Exception;
import java.sql.*;

public class JDBC
{
    /*Steps to connect with DB and perform operations 
       1.Load driver
       2.create connection
       3.create statement
       4.execute query
       5.close connection*/ 
    public void retrivalResultSet()
    {
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="password";
        String query="Select * from cse;";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,userName,password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                System.out.println(rs.getInt("REG_NO")+"    "+rs.getString("NAME")+"  "+rs.getString("PHONE_NUMBER")+"  "+rs.getString("GENDER")+"  "+rs.getString("CITY"));
            }
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
        jd.retrivalResultSet();
    }
}
