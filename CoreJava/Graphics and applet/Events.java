import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Events extends Applet implements ActionListener
{
    

	//1.Declare text fields ,buttons and labels 
	TextField t1 = new TextField(10);
  
	TextField t2 = new TextField(10);
  
	TextField t3 = new TextField(10);
   

	Label l1 = new Label("FIRST NO=:");
   
	Label l2 = new Label("SECOND NO:");
   
	Label l3 = new Label("SUM:");
  

	Button b = new Button("ADD");

    
	public void init()
    
	{
        
		//2.Set Layouts and colors
		Frame f1=new Frame("Sum");
		resize(400,200);
		//f1.setLayout(new GridLayout(3,2));
		//t1.setForeground(Color = Red);
		//3.add components 

        		add(l1);
        
		add(t1);

        		add(l2);
        
		add(t2);
		
add(l3);
      
		add(t3);
        
		add(b);
        
		//call method actionPerformed
		b.addActionListener(this); 
    
	}
    

	public void actionPerformed(ActionEvent e)

	{

       		if (e.getSource() == b)
        
		{
            
			int n1 = Integer.parseInt(t1.getText());
            
			int n2 = Integer.parseInt(t2.getText());
            
			t3.setText(" " + (n1 + n2));
        
		}
    
	}
	public static void main(String args[])
	{
		Events e=new Events();
		e.init();
	}
	//<applet code="Events.class" height=500 width=500></applet>

}