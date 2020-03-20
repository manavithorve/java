import javax.sql.*;
import java.sql.*;
import java.util.*;

class JDBC_API
{
	public static int ch,choice,i,rNo;
	public static Scanner sc=new Scanner(System.in);
	public static Connection con=null;	
	public static PreparedStatement ps =null;
	public static Statement stmt=null;
	public static CallableStatement cStmt=null;
	public static ResultSet rs;
	
	public static void main(String args[])throws SQLException
	{
		try
		{
			//Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//Connection to DB
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456");
			System.out.println("Connection to : "+con);

			do
			{
				System.out.println("Enter Your Choice ");
				System.out.println("1-Save \n2-Delete \n3-Update \n4-Search \n5-View");
				choice=sc.nextInt();
				
				switch(choice)
				{

					case 1 :	saveRecord();
					break;

					case 2 :	deleteRecord();		
					break;

					case 3:		updateRecord();
					break;
			
					case 4:		searchRecord();				
					break;

					case 5:		displayRecords();
					break;
					
					default: System.out.println("Wrong Choice");
				
				}//end switch
		
				System.out.println("\nDo you want to continue?,Press 1");
				ch=sc.nextInt();
			
			}while(ch==1);
		}
		catch(Exception e)
		{
			System.out.println("An error occured due to : "+e);
		}
	}
	
	//save
	public static void saveRecord()throws SQLException
	{
		String query="insert into register values(?,?,?)";
		System.out.println("Enter the RegNo, Name and Surname to save the record ");
		rNo=sc.nextInt();
		String name=sc.next();
		String lname=sc.next();
					
		ps= con.prepareStatement(query);
		ps.setInt(1,rNo);
		ps.setString(2,name);
		ps.setString(3,lname);
				
		i=ps.executeUpdate();
					
		if(i>0)
		{
			System.out.println("Record Saved..");
		}
	}
	
	//delete
	public static void deleteRecord()throws SQLException
	{
		String query="delete from register where regNo=?";
		System.out.println("Enter Registration number to delete the record");
		rNo=sc.nextInt();
					
		ps=con.prepareStatement(query);
		ps.setInt(1,rNo);
				
		i=ps.executeUpdate();
					
		if(i>0)
		{
			System.out.println("Record Deleted");
		}
	}
	
	//update
	public static void updateRecord()throws SQLException
	{
		String query="update register set LNAME=? where regNo=?";
		System.out.println("Enter Registration Number to change last name");
		rNo=sc.nextInt();
		
		ps=con.prepareStatement(query);
		
		System.out.println("Enter the surname to change");
		String lname=sc.next();
		
		ps.setString(1,lname);
		ps.setInt(2,rNo);
					
		i=ps.executeUpdate();
					
		if(i>0)
		{
			System.out.println("Record Updated");
		}
	}
	
	//search
	public static void searchRecord()throws SQLException
	{
		
		System.out.println("Enter Registration Number to search the record");
		rNo=sc.nextInt(); 	
					
		cStmt=con.prepareCall("{call getDetails(?,?,?)}");
		cStmt.setInt(1,rNo);
		cStmt.registerOutParameter(2,java.sql.Types.VARCHAR);
		cStmt.registerOutParameter(3,java.sql.Types.VARCHAR);
		cStmt.execute();
		
		System.out.println("\nFist Name\t\tLast Name");
		System.out.println("\n----------------------------------------------------------------------------------------------------------");
		System.out.println(cStmt.getString(2)+"\t\t\t"+cStmt.getString(3)+"\n");
	}
	
	//display
	public static void displayRecords()throws SQLException
	{
		String str="select *from register";
		Statement st=con.createStatement();
		rs=st.executeQuery(str);
				
		System.out.println("\nRegNo\t\tFist Name\t\tLast Name");
		System.out.println("\n----------------------------------------------------------------------------------------------------------");
					
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\n");
		}			
	}
}