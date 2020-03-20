import java.applet.*;
import java.awt.*;

//<applet code="ShowFonts.class"  height=400 width=400></applet>

public class ShowFonts extends Applet
{
	public void paint(Graphics g)
	{
		String msg="";
		String FontList[];
		
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList=ge.getAvailableFontFamilyNames();
		for(int i=0;i<FontList.length;i++)
		{
			msg+=FontList[i]+"\n";
			g.drawString(msg,4,16);
		}
	}
}