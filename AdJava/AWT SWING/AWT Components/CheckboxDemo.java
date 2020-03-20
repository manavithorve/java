import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="CheckboxDemo.class" width=900 height=500></applet>

public class CheckboxDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox cbJp2,cbJsp,cbAnd,cbSt,cbCs;
	
	public void init()
	{
		cbJp2=new Checkbox("Java Progrmming 2");
		cbJsp=new Checkbox("Java Server Pages");
		cbAnd=new Checkbox("Android");
		cbCs=new Checkbox("Computer Security");
		cbSt=new Checkbox("Software Testing");
		
		/*add controls to the applet window*/
		
		add(cbJp2);
		add(cbJsp);
		add(cbAnd);
		add(cbCs);
		add(cbSt);
		
		//register event
		
		cbJp2.addItemListener(this);
		cbJsp.addItemListener(this);
		cbAnd.addItemListener(this);
		cbCs.addItemListener(this);
		cbSt.addItemListener(this);
		
	}//end init
	
	public void itemStateChanged(ItemEvent ie)
	{
			repaint();
	}//end itemStateChanged()
	
	public void paint(Graphics g)
	{
		msg="Current Selected : ";
		g.drawString(msg,100,100);
		
		msg=cbJp2.getLabel()+" "+cbJp2.getState();
		g.drawString(msg,100,120);
		
		msg=cbJsp.getLabel()+" "+cbJsp.getState();
		g.drawString(msg,100,140);
		
		msg=cbAnd.getLabel()+" "+cbAnd.getState();
		g.drawString(msg,100,160);
		
		msg=cbCs.getLabel()+" "+cbCs.getState();
		g.drawString(msg,100,180);
		
		msg=cbSt.getLabel()+" "+cbSt.getState();
		g.drawString(msg,100,200);
	}
}