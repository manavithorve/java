import java.sql.*;
import javax.sql.*;

public class DisplayData
{
	public static void main(String args[])throws SQLException
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:XE","system","123456");
			System.out.println("Connection to "+con);
			CallableStatement cs=con.prepareCall("{execute DISPLAYDATA(?)}");
			cs.setInt(1,126);
			cs.execute();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}