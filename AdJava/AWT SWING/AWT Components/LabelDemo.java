import java.applet.*;
import java.awt.*;

//<applet code="Label.class" height=400 , width=400 ></applet>

public class LabelDemo extends Applet
{
	public void init()
	{
		Label lname=new Label("This is Java");
		add(lname);
	}
}