import java.sql.*;
import javax.sql.*;

class TestStudentDatabase 
{
	static Connection con;
	public static void main(String args[]) throws SQLException
	{
		int rollNo;
		String sName;
		try
		{
			Class.forName("")
			con=DriverManager.getConnection("jdbc:odbc:StudentDatabase");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from StudentDetails");
			while(rs.next())
			{
				rollNo=rs.getInt("id");
				sName=rs.getString("sName");
				System.out.println("Hii "+sName+"your roll no is "+rollNo);
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occured due to: "+e);
		}
		finally
		{
			con.close();
		}
	}
}