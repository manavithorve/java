import java.awt.*;
import java.applet.*;

//<applet code="FontClassDemo.class" height=500 width=500></applet>

public class FontClassDemo extends Applet
{
	String msg="";
	String FontList[];
	
	public void paint(Graphics g)
	{
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList=ge.getAvailableFontFamilyNames();
		
		for(int i=0;i<FontList.length;i++)
		{
			msg=FontList[i]+" ";
		}
		g.drawString(msg,50,60);
	}
}
