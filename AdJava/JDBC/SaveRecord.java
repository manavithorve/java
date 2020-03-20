import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
import javax.swing.*;

public class SaveRecord extends JFrame implements ActionListener{
	
	JTextField tRegNo,tFName,tLName;
	JButton bRegister,bLogin,bDisplay;
	JPanel mainPanel,pRegister,pLogin,pDisplay;
	Connection con;
	ResultSet rs;
	JLabel lRecords,lMetaData;
	
	public SaveRecord()
	{
		super("Records");
		setSize(500,500);
		setVisible(true);
		mainPanel=new JPanel();
		getContentPane().add(mainPanel);
		
		bRegister= new JButton("Register");
		bLogin= new JButton("Login");
		bDisplay= new JButton("Display All ");
		
		tRegNo=new JTextField(10);
		tFName=new JTextField(10);
		tLName=new JTextField(10);
		
		mainPanel.add(tRegNo);
		mainPanel.add(tFName);
		mainPanel.add(tLName);
		mainPanel.add(bRegister);
		mainPanel.add(bLogin);
		mainPanel.add(bDisplay);
		
		bRegister.addActionListener(this);
		bLogin.addActionListener(this);
		bDisplay.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try 
		{
		if(ae.getSource()==bRegister)
		{
			mainPanel.setVisible(false);
			pRegister=new JPanel();
			pRegister.setBackground(Color.cyan);
			getContentPane().add(pRegister);
		}
		if(ae.getSource()==bDisplay)
		{
			mainPanel.setVisible(false);
			pDisplay=new JPanel();
			pDisplay.setBackground(Color.cyan);
			getContentPane().add(pDisplay);
			
			Class.forName("oracle.jdbc.OracleDriver");//load driver 
			//connection to db
			con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456");
			System.out.println("Connection : "+con);
			
			String str="select *from register";
			Statement st=con.createStatement();
			rs=st.executeQuery(str);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			JLabel l0=new JLabel("\n--------------------------------------------");
			pDisplay.add(l0);
			for(int j=1;j<=rsmd.getColumnCount();j++)
			{
				lMetaData=new JLabel(rsmd.getColumnName(j)+"\t");
				pDisplay.add(lMetaData);
			}
				JLabel l1=new JLabel("\n--------------------------------------------");
				pDisplay.add(l1);
			
			while(rs.next())
			{
				lRecords=new JLabel(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n");
				pDisplay.add(lRecords);
			}
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		
		new SaveRecord();

	}

}
