import java.applet.*;
import java.awt.*;

//<applet code="MultiLine.class" height=400 width=400></applet>

public class MultiLine extends Applet
{
	int curX=0,curY=0;	
	FontMetrics fm;
	
	public void init()
	{
		Font f=new Font("SansSerif",Font.BOLD,14);
		setFont(f);

	}

	public void paint(Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();

		nextLine("We are studying Fonts",g);
		nextLine("Using FontMetrics",g);
		sameLine("class and it's methods",g);
		
	}
	
	void nextLine(String s,Graphics g)
	{
		fm=g.getFontMetrics();
		
		curY+=fm.getHeight();
		curX=0;
		g.drawString(s,curX,curY);
		curX=fm.stringWidth(s);
	}

	void sameLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		g.drawString(s,curX,curY);
		curX += fm.stringWidth(s);
	}
}