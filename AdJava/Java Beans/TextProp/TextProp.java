import java.beans.*;
import java.io.Serializable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextProp extends JPanel implements Serializable
{
	JTextField textfield1;
	JLabel label1;
	private String labelValue="Hello";
	private Font fontValue=new Font("Arial",Font.BOLD,30);
	private Color backgroundColor=new Color(20,0,255);
	private Color foregroundColor=new Color(20,0,255);
	
	public TextProp()
	{
		label1=new JLabel("Hello");
		add(label1);
		textfield1=new JTextField(15);
		add(textfield1);
	}
	public String getLabelValue()
	{
		return labelValue;
	}
	public void setLabelValue(String labelVal)
	{
		labelValue=labelVal;
		label1.setText(labelValue);
	}
	public Font getFontValue()
	{
		return fontValue;
	}
	public void setFontValue(Font f)
	{
		fontValue=f;
		textfield1.setFont(fontValue);
	}
	public Color getBackgroundColor()
	{
		return backgroundColor;
	}
	public void setBackgroundColor(Color b)
	{
		backgroundColor=b;
		textfield1.setBackground(backgroundColor);
	}
	public Color getForegroundColor()
	{
		return foregroundColor;
	}
	public void setForegroundColor(Color f)
	{
		foregroundColor=f;
		textfield1.setForeground(foregroundColor);
	}
}