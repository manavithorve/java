import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="JTabbedPaneDemo.class" width=900 height=900></applet>

public class JTabbedPaneDemo extends JApplet
{
	JTabbedPane jtPane;
	JPanel jpOdd18,jpEven18;
	public void init()
	{
		jtPane=new JTabbedPane();
		
		jpOdd18=new Odd18();
		jpEven18=new Even18();
		
		jtPane.addTab("Odd 2018" ,jpOdd18);
		jtPane.addTab("Even 2018" ,jpEven18);
		
		getContentPane().add(jtPane);
	}
}
class Odd18 extends JPanel
{
	public Odd18()
	{
		add(new JCheckBox("Java"));
		add(new JCheckBox("Android"));
		add(new JCheckBox("CS"));
		add(new JCheckBox("JSP"));
		add(new JCheckBox("ST"));
	}
}
class Even18 extends JPanel
{
	public Even18()
	{
		add(new JRadioButton("Java"));
		add(new JRadioButton("Android"));
		add(new JRadioButton("CS"));
		add(new JRadioButton("JSP"));
		add(new JRadioButton("ST"));
	}
}