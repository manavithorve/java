import java.applet.*;
import java.awt.*;

public class LoopApplet extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0;i<=2;i++)
		{
			if(i%2==0)
			{
				g.drawOval(100,i*60+10,50,50);
			}
			else
			{
				g.fillOval(100,i*60+10,50,50);
			}
		}
		for(int i=0;i<=2;i++)
		{
			if(i%2==0)
			{
				g.fillOval(200,i*60+10,50,50);
			}
			else
			{
				g.drawOval(200,i*60+10,50,50);
			}
		}
		for(int i=0;i<=2;i++)
		{
			if(i%2==0)
			{
				g.drawOval(300,i*60+10,50,50);
			}
			else
			{
				g.fillOval(300,i*60+10,50,50);
			}
		}
	}
	/*public void test(Graphics g)
	{
		
		for(int i=0;i<=2;i++)
		{
			if(i%2==0)
			{
				g.drawOval(100,i*60+10,50,50);
			}
			else
			{
				g.fillOval(200,(i-1)*60+10,50,50);
			}
		}
	}*/
	//<applet code="LoopApplet.class" width=500 height=500></applet>
}