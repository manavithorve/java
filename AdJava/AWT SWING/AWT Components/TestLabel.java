import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TestLabel.class" height=300 , width=300></applet>

public class TestLabel extends Applet implements ActionListener
{
	Label lname;
	TextField tname;
	Button bok,bcancel;
	String str;
	
	public void init()
	{
		Button bok= new Button("OK");
		Button bcancel= new Button("Cancel");
		
		add(bok);
		add(bcancel);
		
		bok.addActionListener(this);
		bcancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		if(str.equals("OK"))
		{
			str="You clicked Ok button";
		}
		else
		{
			str="You clicked Cancel button";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,40,60);
	}
}