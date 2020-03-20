import javax.sql.*;
import java.sql.*;
import java.util.*;
class TestJDBCApp
{
	public static void main(String args[])throws Exception
	{
		
		//Load driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection to DB
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456");
		System.out.println("Connection: "+con);
		
		Scanner sc=new Scanner(System.in);
		int ch,choice,i,rNo;
		PreparedStatement ps =null;//for dynamic query 
		do
		{
		System.out.println("Enter Your Choice ");
		System.out.println("1-Save \n2-Delete \n3-Update \n4-Search \n5-Get Metadata");
		choice=sc.nextInt();
		switch(choice)
		{

		case 1 ://Save
					System.out.println("Enter the values to save the record ");
					rNo=sc.nextInt();
					String name=sc.next();
					String lname=sc.next();
					
					ps= con.prepareStatement("insert into register values(?,?,?)");
					ps.setInt(1,rNo);
					ps.setString(2,name);
					ps.setString(3,lname);
					 
					i=ps.executeUpdate();
					
					if(i>0)
					{
						System.out.println("Record Saved..");
					}
		break;

		case 2 ://Delete 
					System.out.println("Enter Registration number to delete the record");
					rNo=sc.nextInt();
					
					ps=con.prepareStatement("delete from register where regNo=?");
					ps.setInt(1,rNo);
				
					i=ps.executeUpdate();
					
					if(i>0)
					{
							System.out.println("Record Deleted");
					}
		break;

		case 3://update
					System.out.println("Enter Registration Number to change last name");
					rNo=sc.nextInt();
					
					ps=con.prepareStatement("update register set LNAME=? where regNo=?");
					System.out.println("Enter the surname to change");
					lname=sc.next();
					ps.setString(1,lname);
					ps.setInt(2,rNo);
					
					i=ps.executeUpdate();
					
					if(i>0)
					{
						System.out.println("Record Updated");
					}
		break;
			
		case 4://Search
					System.out.println("Enter Registration Number to search the record");
					ps=con.prepareStatement("select *from register where regNo=?");
					rNo=sc.nextInt(); 	
					
					ps.setInt(1,rNo);
					
					ResultSet rs=ps.executeQuery();
					rs.next();	//moves the pointer from coloumn name to the record 	to be seached 
					
					System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+	
									"\t"+rs.getString(3)+"\n");
					
		break;

		case 5:
					String str="select *from register";
					Statement st=con.createStatement();
					rs=st.executeQuery(str);
					
					System.out.println("\n--------------------------------------------");
					
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+					"\t"+rs.getString(3)+"\n");
					}
		break;			
		}//end switch
		
			System.out.println("\nDo you want to continue?,Press 1");
			ch=sc.nextInt();
			
		}while(ch==1);
	}	
}