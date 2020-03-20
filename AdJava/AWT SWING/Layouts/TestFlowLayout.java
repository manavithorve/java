import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="TestFlowLayout.class" width=300 height=500></applet>

public class TestFlowLayout extends Applet
{
	Label fname,lname;
	TextField tfname,tlname;
	Button bsubmit,breset;
	
	public TestFlowLayout()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		fname=new Label("Enter your First name ");
		lname=new Label("Enter your Last name ");
		tfname=new TextField(10);
		tlname=new TextField(10);
		bsubmit=new Button("Submit");
		breset=new Button("Reset");
		
		//adds the control to the applet window 
		
		add(fname);
		add(tfname);
		add(lname);
		add(tlname);
		add(bsubmit);
		add(breset);
	}
	public static void main(String args[])
	{
			new TestFlowLayout();
	}
}
