import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="ListDemo.class" width=900 height=500></applet>

public class ListDemo extends Applet implements ActionListener
{
	String msg="";
	List lSub;
	Label lList;
	
	public void init()
	{
		lList=new Label("Choose Subjects : ");
		lSub=new List(5,true);
		
		//add labels in choice
		
		lSub.add("JP");
		lSub.add("JSP");
		lSub.add("Android");
		lSub.add("CS");
		lSub.add("ST");
		add(lList);
		add(lSub);
		
		//registers the event
		
		lSub.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{	
		msg="Current Selected item: ";
		int idx[]=lSub.getSelectedIndexes();
		for(int i=0;i<idx.length;i++)
		{
			msg +=lSub.getItem(idx[i])+" ";
			g.drawString(msg,100,100);
		}	
	}
}