import java.applet.*;
import java.awt.*;

public class ParametricApplet extends Applet
{
	String n;
	String a;
	
	public void init()
	{
		n=getParameter("name");
		if(n==null)
		{
			n="Shivani";
		}
		a=getParameter("age");
		
	}
	public void paint(Graphics g)
	{
		g.drawString(n+" is a student who is "+a+" years old ",20,60);

	}
	/*<applet code=ParametricApplet.class height=300 width=300>

	<param name="name" value="Manavi" /><br>
	<param name="age" value="18" /><br>

	</applet>*/
}