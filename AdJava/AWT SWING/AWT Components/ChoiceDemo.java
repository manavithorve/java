import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="ChoiceDemo.class" width=900 height=500></applet>

public class ChoiceDemo extends Applet implements ItemListener
{
	String msg="";
	Choice ch;
	Label lChoice;
	
	public void init()
	{
		lChoice=new Label("Choose Subjects : ");
		ch=new Choice();
		
		//add labels in choice
		
		ch.add("JP");
		ch.add("JSP");
		ch.add("Android");
		ch.add("CS");
		ch.add("ST");
		add(ch);
		
		//registers the event
		
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		
		String msg="Current Selected item: ";
		msg+=ch.getSelectedItem();
		g.drawString(msg,100,100);
	}
}