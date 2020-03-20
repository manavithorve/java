import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

//<applet code="JTreeDemo.class" width=500 height=500></applet>

public class JTreeDemo extends JApplet
{
	DefaultMutableTreeNode Dept,Comp,It,cFy,cSy,cTy,iFy,iSy,iTy,cJava,cCn,cPic,iEcom,cNma,cJsp;
	DefaultMutableTreeNode iRd,iCpp,iMis,iNet,iPhp,cAndroid;
	JTree tree;
	
	public void init()
	{
		Dept=new DefaultMutableTreeNode("Department");
		Comp=new DefaultMutableTreeNode("Computer");
		It=new DefaultMutableTreeNode("IT");
		cFy=new DefaultMutableTreeNode("First Year");
		cSy=new DefaultMutableTreeNode("Second Year");
		cTy=new DefaultMutableTreeNode("Third Year");
		iFy=new DefaultMutableTreeNode("First Year");
		iSy=new DefaultMutableTreeNode("Second Year");
		iTy=new DefaultMutableTreeNode("Third Year");
		
		cJava=new DefaultMutableTreeNode("Java Programming");
		cAndroid=new DefaultMutableTreeNode("Android");
		cJsp=new DefaultMutableTreeNode("JSP");
		cPic=new DefaultMutableTreeNode("C programming");
		cCn=new DefaultMutableTreeNode("Computer Networks");
		cNma=new DefaultMutableTreeNode("NMA");
		iCpp=new DefaultMutableTreeNode("C++");
		iEcom=new DefaultMutableTreeNode("E Commerce");
		iMis=new DefaultMutableTreeNode("MIS");
		iNet=new DefaultMutableTreeNode("ASP.NET");
		iPhp=new DefaultMutableTreeNode("PHP");
		iRd=new DefaultMutableTreeNode("RDBMS");
		
		Dept.add(Comp);
		Dept.add(It);
		
		Comp.add(cFy);
		Comp.add(cSy);
		Comp.add(cTy);
		
		It.add(iFy);
		It.add(iSy);
		It.add(iTy);
		
		cFy.add(cPic);
		cFy.add(cNma);
		cSy.add(cJava);
		cSy.add(cCn);
		cTy.add(cAndroid);
		cTy.add(cJsp);
		iFy.add(iEcom);
		iFy.add(iRd);
		iSy.add(iCpp);
		iSy.add(iNet);
		iTy.add(iPhp);
		iTy.add(iMis);
		
		tree=new JTree(Dept);
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		JScrollPane sp=new JScrollPane(tree,vsb,hsb);
		getContentPane().add(sp);
	}
}