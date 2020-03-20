import java.sql.*;
import javax.sql.*;
class JDBCDemo1
{
	public static void main(String args[])
	{
		
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:sample");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				int rn=rs.getInt("roll no");
				String nam=rs.getString("sname");
				System.out.println(rn+"\t\t"+nam);	
			}
		}
		catch(SQLException se){System.out.println(""+se);}
		finally
		{
			//con.close();
		}
	}
}