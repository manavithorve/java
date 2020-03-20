import java.sql.*;
import javax.sql.*;

public class OracleConnectivity
{
		public static void main(String args[])throws SQLException
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456");
				System.out.println("Connected to : "+con);
			}
			catch(Exception e)
			{
				System.out.println("An error occured due to: "+e);
			}
		}
}