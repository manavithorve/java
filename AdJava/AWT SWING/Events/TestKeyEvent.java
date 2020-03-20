import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="TestKeyEvent.class" width=300 height=300></applet>

public class TestKeyEvent extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent ke)
	{
		msg="Key Typed";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg="Key Released";
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		msg="Key Typed";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,60);
	}
}