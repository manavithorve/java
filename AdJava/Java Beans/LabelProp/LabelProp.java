import java.beans.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelProp extends JPanel implements Serializable
{
	 JLabel l1;
	 private String caption="Send";
	 
	 public LabelProp()
	 {
		 l1=new JLabel("Send");
		 add(l1);
	 }
	 public String getCaption()
	 {
		 return caption;
	 }
	 public void setCaption(String str)
	 {
		 caption=str;
		 l1.setText(caption);
	 }
}