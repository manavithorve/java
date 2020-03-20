package sunw.demo.colors;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
public class ColorsBeanInfo extends SimpleBeanInfo
{
		public PropertyDescriptor[] getPropertyDescriptor()
		{
			try
			{
				PropertyDescriptor rectangular= new PropertyDescriptor("rectangular",Colors.class);
				PropertyDescriptor pd[]={rectangular};
				return pd;
			}
			catch(Exception e)
			{
				
			}
			return null;
		}		
}