import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="CheckboxGroupDemo.class" width=900 height=500></applet>

public class CheckboxGroupDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox cbMale,cbFemale;
	CheckboxGroup cbg;
	Label lGender;
	
	public void init()
	{
		lGender=new Label("Gender");
		cbg=new CheckboxGroup();
		cbMale=new Checkbox("Male",cbg,false);
		cbFemale=new Checkbox("Female",cbg,true);
		
		//add control to the applet window
		add(lGender);
		add(cbMale);
		add(cbFemale);
		
		//registers the event
		
		cbMale.addItemListener(this);
		cbFemale.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		
		String msg="Current Selected : ";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,100,100);
	}
}