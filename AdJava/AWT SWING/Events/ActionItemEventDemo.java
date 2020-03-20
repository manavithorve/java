import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="ActionItemEventDemo.class" width=900 height=900></applet>*/

public class ActionItemEventDemo extends Applet implements ActionListener , ItemListener
{
	//control declaration 
	Label lFname,lLname,lGender,lAddress,lEmail,lPhone,lCourse,lEnrol,lDiv;
	TextField tEnrol,tFname,tLname,tPhone,tEmail;
	TextArea tAddress;
	Choice cDiv;
	CheckboxGroup cbgGender;
	List courseList;
	Button bRegister;
	Panel p1;
	String msg="";
	
	public void init()
	{

		//create objects for each control 
		lEnrol=new Label("Enrolment No : ");
		lFname=new Label("First Name : ");
		lLname=new Label("Last Name : ");
		lGender=new Label("Gender: ");
		lAddress=new Label("Address : ");
		lEmail=new Label("Email : ");
		lPhone=new Label("Phone No : ");
		lCourse=new Label("Courses : ");
		lDiv=new Label("Division : ");
		
		//creating textboxes
		tEnrol=new TextField(7);
		tFname=new TextField(12);
		tLname=new TextField(12);
		tPhone=new TextField(10);
		tEmail=new TextField(20);
		
		//creating text area 
		tAddress=new TextArea(3,20);
		
		//creating dropdown list
		cDiv=new Choice();
		cDiv.add("A1");
		cDiv.add("A2");
		cDiv.add("A3");
		
		//creating radio buttons
		cbgGender=new CheckboxGroup();
		Checkbox cbMale=new Checkbox("Male",cbgGender,false);
		Checkbox cbFemale=new Checkbox("Female",cbgGender,true);
		
		//creating multiple course selection list
		courseList=new List(5,true);
		courseList.add("Java Programming");
		courseList.add("Android");
		courseList.add("Java Server Pages");
		courseList.add("Software Testing");
		courseList.add("Computer Security");
		
		//creating button
		bRegister=new Button("Register");
		
		//adding controls to the applet window
		add(lEnrol);
		add(tEnrol);
		add(lFname);
		add(tFname);
		add(lLname);
		add(tLname);
		add(lDiv);
		add(cDiv);
		add(lPhone);
		add(tPhone);
		add(lEmail);
		add(tEmail);
		add(lGender);
		add(cbMale);
		add(cbFemale);
		add(lAddress);
		add(tAddress);
		add(lCourse);
		add(courseList);
		add(bRegister);
		
		bRegister.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,160);
		msg="Student Name :- "+tFname.getText()+"  "+tLname.getText()+".";
		g.drawString(msg,50,180);
		msg="Enrolment Number : "+tEnrol.getText()+"    |    Division : "+cDiv.getSelectedItem();
		g.drawString(msg,50,200);
		msg="Phone : "+tPhone.getText()+"   |    Email : "+tEmail.getText();
		g.drawString(msg,50,220);		
		msg="Gender : "+cbgGender.getSelectedCheckbox().getLabel();
		g.drawString(msg,50,240);
		msg="Address : "+tAddress.getText();
		g.drawString(msg,50,260);
		msg="Registered Courses : "+courseList.getSelectedItem();
		g.drawString(msg,50,280);
	}
	public void actionPerformed(ActionEvent ae)
	{
		msg="Registration successful!";
		repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
}