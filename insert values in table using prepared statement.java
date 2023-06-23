import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class JDBC
{
    /*Steps to connect with DB and perform operations 
       1.Load driver
       2.create connection
       3.create statement
       4.execute query
       5.close connection*/
    public void insertValueInTable_prepared()
    {
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="password";
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,userName,password);
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO CSE(REG_NO,NAME,PHONE_NUMBER,GENDER,CITY) VALUES(?,?,?,?,?);");
            
            pstmt.setInt(1,1);
            pstmt.setString(2,"Anirban Ghosh");
            pstmt.setString(3,"9054433876");
            String charString = Character.toString('M');
            pstmt.setString(4,charString);
            pstmt.setString(5,"Jamshedpur");
            
            pstmt.executeUpdate();
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
        jd.insertValueInTable_prepared();
    }
}
