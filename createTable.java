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
    public void createTable()
    {
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="Password";
        String query="CREATE TABLE CSE(REG_NO INT PRIMARY KEY,NAME VARCHAR(40),PHONE_NUMBER BIGINT,GENDER VARCHAR(1),CITY VARCHAR(50) DEFAULT 'Jamshedpur');";
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,userName,password);
            Statement stmt=con.createStatement();
            stmt.executeUpdate(query);
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
        jd.createTable();
    }
}
