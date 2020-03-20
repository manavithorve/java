import javax.swing.*;
import java.applet.*;
import java.awt.*;

//<applet code="RegistrationSwing.class" height=400 width=400></applet>

public class RegistrationSwing extends JApplet
{
	JLabel lName,lAddr,lYear,lGender,lSubject,lMob;
	JTextField tName,tMob;
	JTextArea tAddr;
	JComboBox jYear;
	JRadioButton rdMale,rdFemale,rdEven,rdOdd;
	JCheckBox cbjp,cband,cbjsp,cbcs,cbst;
	JButton jSubmit,jReset;
	ButtonGroup bgYear;


	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());

		lName=new JLabel("Name:");
		tName=new JTextField(10);
		cp.add(lName);
		cp.add(tName);

		lMob=new JLabel("Mobile NO:");
		tMob=new JTextField(10);
		cp.add(lMob);
		cp.add(tMob);

		lAddr=new JLabel("Address:");
		tAddr=new JTextArea(5,10);
		cp.add(lAddr);
		cp.add(tAddr);


		lGender=new JLabel("Gender:");
		rdMale=new JRadioButton("Male",true);
		rdFemale=new JRadioButton("Female");
		cp.add(lGender);
		cp.add(rdMale);
		cp.add(rdFemale);

		lYear=new JLabel("Year:");
		bgYear=new ButtonGroup();
		rdEven=new JRadioButton("Even");
		rdOdd=new JRadioButton("Odd");
		bgYear.add(rdEven);
		bgYear.add(rdOdd);
		cp.add(lYear);
		cp.add(rdEven);
		cp.add(rdOdd);
		
		
		lSubject=new JLabel("Subject:"); 
		cbjp=new JCheckBox("Java Programming");
		 cbjsp=new JCheckBox("JSP");
		 cband=new JCheckBox("ANDROID");
		 cbcs=new JCheckBox("Computer Security");
		 cbst=new JCheckBox("Software Testing");
		cp.add(lSubject);
		cp.add(cbjp);
		cp.add(cbjsp);
		cp.add(cband);
		cp.add(cbcs);
		cp.add(cbst);

		jSubmit=new JButton("Submit");
		jReset =new JButton("Reset");	
		cp.add(jSubmit);
		cp.add(jReset);

	}
}
