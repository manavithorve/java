import java.applet.*;
import java.awt.*;
//<applet code="FontMatrix.class " height=500 width=500></applet>

public class FontMatrix extends Applet
{
	int curX,curY;
	public void init()
	{
		Font f=new Font("SansSerif",Font.PLAIN,22);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		FontMetrics f1=g.getFontMetrics(); //details of current font	
		
		nextLine("This is line 1",g);
		nextLine("This is line 2",g);
		sameLine("This is on same line",g);
		sameLine("This is too",g);
	}
	void nextLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		curY=fm.getHeight();
		curX=0;
		g.drawString(s,curX,curY);
		curX=fm.stringWidth(s);
		
	}
	void sameLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		g.drawString(s,curX,curY);
		curX=fm.stringWidth(s);
		
	}
}