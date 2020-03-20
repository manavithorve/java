import java.awt.*;
import java.applet.*;

//<applet code="TestGridLayout.class" width=300 height=500></applet>

public class TestGridLayout extends Applet
{
	Button b;
	public void init()
	{
		setLayout(new GridLayout(3,3,5,5));
		for(int i=1;i<=9;i++)
		{
			b=new Button(""+i);
			add(b);
		}
	}
}