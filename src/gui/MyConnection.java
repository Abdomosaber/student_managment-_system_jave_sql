
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyConnection 
{
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Java_Files\\DataBase\\SMS.accdb");
        } 
        catch (ClassNotFoundException | SQLException ex )
        {
           System.out.println(ex.getMessage());
        }
        return con;
    }
}
