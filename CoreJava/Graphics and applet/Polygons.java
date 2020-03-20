import java.applet.*;
import java.awt.*;
public class Polygons extends Applet
{
	int x1[]={20,120,220,20};
	int y1[]={20,120,20,20};
	int n1=4;
	
	int x2[]={120,220,220,120};
	int y2[]={120,220,20,120};
	int n2=4;
	
	public void paint(Graphics g)
	{
		Polygon p1=new Polygon();
		p1.addPoint(300,20);
		p1.addPoint(600,200);
		p1.addPoint(300,200);
		p1.addPoint(600,20);
		g.drawPolygon(p1);
		g.drawPolygon(x1,y1,n1);
		g.fillPolygon(x2,y2,n2);
	}
	
	//<applet code="Polygons.class" height=900 width=900 ></applet>
}