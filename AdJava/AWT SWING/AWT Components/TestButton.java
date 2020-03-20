import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TestButton.class" height=300 , width=300></applet>

public class TestButton extends Applet implements ActionListener
{
	String str;
	Button b[]=new Button[10];
	public void init()
	{
		for(int i=0;i<=9;i++)
		{
			b[i]=new Button(""+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		str="You clicked "+ae.getActionCommand();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,50,60);
	}
}