import javax.swing.*;
import java.sql.*;
import javax.sql.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="Login.class" height="500" width="500"></applet>

public class Login extends JApplet implements ActionListener
{
	JFrame frame;
	JLabel lRno,lFname,lLname,login;
	JButton bLogin;
	JTextField tRno,tFname,tLname;
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	int i;
	
	public Login()
	{
		frame=new JFrame("Welcome");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		login=new JLabel("Hello");
		lRno=new JLabel("Registration No");
		tRno=new JTextField(7);
		lFname=new JLabel("Name");
		tFname=new JTextField(15);
		lLname=new JLabel("Surname");
		tLname=new JTextField(15);
		bLogin=new JButton("Login");
		
		frame.add(login);
		frame.add(lRno);
		frame.add(tRno);
		frame.add(lFname);
		frame.add(tFname);
		frame.add(lLname);
		frame.add(tLname);
		frame.add(bLogin);
		bLogin.addActionListener(this);
		add(frame);		
	}
	public static void main(String args[])throws SQLException,Exception
	{
		new Login();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bLogin)
		{
			try
			{
				connect();
			}
			catch(SQLException e)
			{
				System.out.println("Error : "+e);
			}
		}
	}
	public void connect()throws SQLException
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456");
			
			ps=con.prepareStatement("select *from register where regNo=?");
			ps.setInt(1,Integer.parseInt(tRno.getText()));
			
			rs=ps.executeQuery();
			rs.next();	//moves the pointer from coloumn name to the record to be searched 
			
			String name=rs.getString(2);
			login.setText(name);
			if(name.equals(tFname.getText().trim()))
			{
				login.setText("Login Successfull..!");
			}
			else
			{
				login.setText("User Does not exists..!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	