import java.awt.*;
import java.applet.*;
import javax.swing.*;

//<applet code="FontMetricsDemo.class" height=500 width=500></applet>

public class FontMetricsDemo extends Applet
{
	int curX=0,curY=0;
	
	public void init()
	{
		Font f=new Font("SanSerif",Font.PLAIN,20);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		
		nextLine("This is Line1",g);
		nextLine("This is Line2",g);
		sameLine("This is Line2",g);
		nextLine("This is Line3",g);
	}
	public void nextLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		
		curY+=fm.getHeight();
		curX=0;
		g.drawString(s,curX,curY);
		curX=fm.stringWidth(s);
	}
	public void sameLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		
		g.drawString(s,curX,curY);
		curX=fm.stringWidth(s);
	}
}