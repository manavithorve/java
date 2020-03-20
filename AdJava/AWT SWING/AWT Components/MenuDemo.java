import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="MenuDemo.class" height=400 width=400></applet>
 class MenuFrame extends Frame 
{
	Menu mFile,mEdit,mHelp;
	MenuBar mBar;
	MenuItem miNew,miOpen,miSave,miExit,miCut,miCopy,miPaste;
	CheckboxMenuItem cbmi;
	

	MenuFrame(String title)
	{
		super(title);

		//Create menubar.
		mBar=new MenuBar();

		//create File menu.
		mFile=new Menu("File");

		//create MenuItems for File.
		miNew=new MenuItem("New"); 	
		miOpen=new MenuItem("Open");
		miSave=new MenuItem("Save");
		miExit=new MenuItem("Exit");

		//add MenuItems to File menu.
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miExit);
		
		//add File to MenuBar.
		mBar.add(mFile);
		
		//create Edit menu.
		mEdit=new Menu("Edit");

		//create MenuItems for Edit.
		miCut=new MenuItem("Cut"); 	
		miCopy=new MenuItem("Copy");
		miPaste=new MenuItem("Paste");
		

		//add MenuItems to Edit menu.
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
	
		
		//add File to MenuBar.
		mBar.add(mEdit);

		//create Edit menu.
		mHelp=new Menu("Help");

		//create MenuItems for Help.
		cbmi=new CheckboxMenuItem("Debug"); 	
		

		//add MenuItems to Help menu.
		mHelp.add(cbmi);
	
		
		//add Help to MenuBar.
		mBar.add(mHelp);


		//add MenuBar to the window.
		setMenuBar(mBar);
		

		miNew.addActionListener(new MenuDemo());
		miOpen.addActionListener(new MenuDemo());
		miSave.addActionListener(new MenuDemo());
	}

			
}

public class MenuDemo extends Applet implements ActionListener
{
	Frame f;
	public void init()
	{
		f=new MenuFrame("Menu Bar");
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("New") || str.equals("Open")|| str.equals("Save"));
		{
			FileDialog fd=new FileDialog(f,"File Dialog");
			fd.setVisible(true);
		}
	}	
	
	public void start()
	{
		f.setVisible(true);
	}
	
	public void stop()
	{
		f.setVisible(false);
	}
}