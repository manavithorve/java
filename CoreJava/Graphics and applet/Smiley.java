import java.awt.*;
import java.applet.*;
public class Smiley extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(40,40,115,150);
		//x,y,w,h
		
		g.setColor(Color.black);
		g.fillOval(70,75,15,30);
		g.fillOval(105,75,15,30);
		g.drawArc(55,55,80,100,180,180);
	}
	//<applet code="Smiley.class" width=500 height=500 align=middle></applet>
} 