import java.awt.*;
import java.applet.*;
public class BarCharts extends Applet
{
	int n=0;
	String label[];
	int value[];
	
	public void init()
	{
		try
		{
			n=Integer.parseInt(getParameter("Columns"));
			label=new String[n];
			value=new int[n];
			label[0]=getParameter("label1");
			label[1]=getParameter("label2");
			label[2]=getParameter("label3");
			label[3]=getParameter("label4");

			value[0]=Integer.parseInt(getParameter("c1"));
			value[1]=Integer.parseInt(getParameter("c2"));
			value[2]=Integer.parseInt(getParameter("c3"));
			value[3]=Integer.parseInt(getParameter("c4"));			
		}
		catch(NumberFormatException e)
		{
		}
	}
		
	public void paint(Graphics g)
	{
		for(int i=0;i<n;i++)
		{
			g.setColor(Color.red);
			g.drawString(label[i],20,i*50+30);
			g.setColor(Color.red);
			g.fillRect(50,i*50+10,value[i],40);
		}
	}
	
	/*<applet code=BarCharts.class width=300 height=250>
	    <param name="columns" value="4">
	    <param name="c1" value="110">
	    <param name="c2" value="150">
	    <param name="c3" value="100">
	    <param name="c4" value="170"> 
	    <param name="label1" value="91">
	    <param name="label2" value="92">
	    <param name="label3" value="93">
	    <param name="label4" value="94">
	    </applet>*/
}