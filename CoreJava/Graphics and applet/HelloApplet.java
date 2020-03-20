import java.awt.*; //for graphics
import java.applet.*; // for applet
public class HelloApplet extends Applet 
{
	public void paint (Graphics g)
	{
		g.drawString("Hello Java.. ",10,100);
	}
} 