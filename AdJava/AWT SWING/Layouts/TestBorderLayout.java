import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="TestBorderLayout.class" width=300 height=500></applet>

public class TestBorderLayout extends Applet
{
	Button lNorth,lSouth,lEast,lWest;
	TextArea tcenter;
	public void init()
	{
		//creating border layout
		BorderLayout b=new BorderLayout();
		//setting border layout
		setLayout(b);
		
		//create controls
		lNorth=new Button("This is North ");
		lSouth=new Button("This is South");
		lEast=new Button("This is East ");
		lWest=new Button("This is West");
		tcenter=new TextArea(50,50);
		
		//add controls to applet window
		add(lNorth,BorderLayout.NORTH);
		add(lEast,BorderLayout.EAST);
		add(lWest,BorderLayout.WEST);
		add(lSouth,BorderLayout.SOUTH);
		add(tcenter,BorderLayout.CENTER);
	}	
}