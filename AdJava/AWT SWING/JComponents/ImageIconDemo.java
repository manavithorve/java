import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

/*<applet code="ImageIconDemo.class" width="300" height="300">
</applet>*/

public class ImageIconDemo extends JApplet
{
	JTextField jtf;
	JButton jbIndia,jbUS,jbJapan,jbUK;
	String msg="This is image";
	ImageIcon iIndia,iUS,iJapan,iUK;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		iIndia=new ImageIcon("C://Users//lenovo//Desktop//temp_images//taku.jpg"); 
		jbIndia=new JButton(iIndia);	
			
		
		iUS=new ImageIcon("");
		iJapan=new ImageIcon("");
		iUK=new ImageIcon("");

	}
}