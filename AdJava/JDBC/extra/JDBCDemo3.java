import java.sql.*;
import javax.sql.*;
class JDBCDemo3
{
	public static void main(String args[])
	{
		
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:sample");
			Statement st=con.createStatement();
			System.out.println("----------------------------------");
			System.out.println("ID\t\tName");			
			System.out.println("----------------------------------");
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				int rn=rs.getInt("rollno");
				System.out.println("rn"+rn);
			}
			PreparedStatement ps=con.prepareStatement("update student set sname=? where roll no=?");
			ps.setString(1,"Neha");
			ps.setInt(2,1);
		int i=ps.executeUpdate();
		if(i>0)
		System.out.println("Record Updated..");
		else
			System.out.println("not");
			System.out.println("----------------------------------");
			System.out.println("ID\t\tName");			
			System.out.println("----------------------------------");	
			ResultSet rs1=st.executeQuery("select * from student");
			while(rs1.next())
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