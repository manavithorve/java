import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="TestMouseEvent.class" width=300 height=300></applet>

public class TestMouseEvent extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse Entered at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg="Mouse Exited at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg="Mouse Pressed at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		msg="Mouse Released at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		msg="Mouse Moved at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		msg="Mouse Dragged at "+me.getX()+" , "+me.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,60);
	}
}