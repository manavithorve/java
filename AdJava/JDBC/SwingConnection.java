import javax.swing.*;
import java.sql.*;
import javax.sql.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="SwingConnection.class" height="500" width="500"></applet>

public class SwingConnection extends JApplet implements ActionListener
{
	JFrame frame;
	JLabel lRno,lFname,lLname;
	JButton bLogin;
	JTextField tRno,tFname,tLname;
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	int i;
	
	public SwingConnection()
	{
		frame=new JFrame("Welcome");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		lRno=new JLabel("Registration No");
		tRno=new JTextField(7);
		lFname=new JLabel("Name");
		tFname=new JTextField(15);
		lLname=new JLabel("Surname");
		tLname=new JTextField(15);
		bLogin=new JButton("Login");
		
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
	public static void main(String args[])throws SQLException
	{
		new SwingConnection();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()=="bLogin")
		{
			try
			{
			connect();
			}
			catch(SQLException e)
			{
				
			}
		}
	}
	public void connect()throws SQLException
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1521:xe","System","123456");
		}
		catch(ClassNotFoundException e)
		{
			
		}
	}
}	