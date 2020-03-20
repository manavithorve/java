import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="TestCardLayout.class" width=300 height=500></applet>
public class TestCardLayout extends Applet implements ActionListener
{
	CardLayout card;
	Panel osCards,winPane,othersPane;
	Button bWin,bOthers;
	Checkbox cbWin,cbLinux,cbMac,cbWinNT,cbWin98,cbWinXP;
	
	public void init()
	{
		//creates cardlayout object
		card=new CardLayout();
		
		Button bWin=new Button("Windows OS");
		Button bOthers=new Button("Other OS");
		//adds the control to the applet window 
		
		add(bWin);
		add(bOthers);
		
		//creates card deck 
		
		osCards=new Panel();
		osCards.setLayout(card);
		
		winPane=new Panel();
		othersPane=new Panel();
		
		//cbWin=new Checkbox("Windows");
		cbLinux=new Checkbox("Linux");
		cbMac=new Checkbox("MAC OS ");
		
		//othersPane.add(cbWin);
		othersPane.add(cbLinux);
		othersPane.add(cbMac);
		
		cbWinNT=ne,w Checkbox("Windows NT");
		cbWin98=new Checkbox("Windows 98");
		cbWinXP=new Checkbox("Windows XP");
		
		winPane.add(cbWinNT);
		winPane.add(cbWin98);
		winPane.add(cbWinXP);
		
		
		osCards.add(winPane,"Windows");
		osCards.add(othersPane,"Others");
		
		add(osCards);
		
		bWin.addActionListener(this);
		bOthers.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Windows OS"))
		{
			card.show(osCards,"Windows");
		}
		else
		{
			card.show(osCards,"Others");
		}
	}
}