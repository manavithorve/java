import java.applet.*;
import java.awt.*;

public class LineRect extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(10,10,100,100); 
		//x1,y1,x2,y2(4)

		g.setColor(Color.magenta);
		g.drawRect(150,10,400,300); 
		//x,y,width,height(4)

		g.setColor(Color.green);
		g.fillRect(700,40,300,350);
		 //x,y,width,height(4)
	
		g.setColor(Color.cyan);
		g.drawRoundRect(700,400,200,300,10,10); 
		//x,y,width,height,angle of corners,angle of corners(6) 

		g.setColor(Color.blue);
		g.fillRoundRect(50,400,500,500,10,10);
		 //x,y,width,height,angle of corners,angle of corners(6)
	}
	//<applet code="LineRect.class" width=900 height=900></applet>
} 
