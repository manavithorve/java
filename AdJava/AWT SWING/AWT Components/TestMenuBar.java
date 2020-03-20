import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="TestMenuBar.class" width=600 height=600></applet>

class TestMenu extends Frame
{
	MenuBar mBar;
	Menu mFile,mEdit,mHelp;
	MenuItem fileSave,fileNew,fileOpen;
	MenuItem editCut,editCopy,editPaste;
	CheckboxMenuItem helpDebug;
	
	TestMenu(String str)
	{
		super(str);
		
		mBar=new MenuBar();
		setMenuBar(mBar);
		
		mFile=new Menu("File");
		mEdit=new Menu("Edit");
		mHelp=new Menu("Help");
		
		mBar.add(mFile);
		mBar.add(mEdit);
		mBar.add(mHelp);
		
		fileSave=new MenuItem("Save");
		fileNew=new MenuItem("New");
		fileOpen=new MenuItem("Open");
		
		mFile.add(fileNew);
		mFile.add(fileOpen);
		mFile.add(fileSave);
		
		editCopy=new MenuItem("Copy");
		editCut=new MenuItem("Cut");
		editPaste=new MenuItem("Paste");
		
		mEdit.add(editCopy);
		mEdit.add(editCut);
		mEdit.add(editPaste);
		
		helpDebug=new CheckboxMenuItem("Debug");
		
		mHelp.add(helpDebug);
	}
}
public class TestMenuBar extends Applet
{
	Frame f=null;
	
	public void init()
	{
		f=new TestMenu("Menu Bar");
		f.setSize(500,500);
		f.setVisible(true);
	}
}