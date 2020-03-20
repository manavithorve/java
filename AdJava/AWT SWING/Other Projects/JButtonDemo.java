import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JFrame 
{
	JButton bSubmit,bImage;
	ImageIcon i;
	
	public JButtonDemo()
	{
		super("Butto Demo");
		setVisible(true);
		setSize(700,700);
		
		bSubmit = new JButton("Submit");
		i=new ImageIcon("E:/Photos/Camera/IMG20180927180223.jpg");
		bImage=new JButton(i);
		
		add(bSubmit);
		add(bImage);
	}
	public static void main(String args[])
	{
		new JButtonDemo();
	}
}