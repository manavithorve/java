import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="JTableDemo.class" width=300 height=300></applet>

public class JTableDemo extends JApplet
{
	JTable table;
	public void init()
	{
		final String[] colHeads={"Roll No","Name","Phone"};
		final String[][] data={{"1606115","Yash","6758493210"},
							   {"1606130","Aditya","1234567890"	},
							   {"1606095","Pratik","9876543210"},
								{"1606126","Ahemad","9890752345"}};
		table=new JTable(data,colHeads);
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane sp=new JScrollPane(table,vsb,hsb);
		getContentPane().add(sp);
	}
}