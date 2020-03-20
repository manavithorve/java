import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator1 extends JFrame implements ActionListener{

	JPanel p1,p2,p3,p4,p5;
	JTextArea ta1;
	JButton b,badd,bsub,bmulti,bdiv,bsin,btan,bsqrt,bsqr,bclr,baclr,bzero;
	JLabel txtLabel;
	public Calculator1() {
		super("Calculator");
		setSize(900,900);
		setVisible(true);
		
		getContentPane().setLayout(new BorderLayout());
		p1=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		
		p1.setBackground(Color.BLACK);
		p1.setLayout(new GridLayout(1,2));
		getContentPane().add(p1,BorderLayout.NORTH);
		txtLabel=new JLabel("Calculation");
		txtLabel.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,56));
		txtLabel.setForeground(Color.orange);
		p1.add(txtLabel);
		JTextArea ta1=new JTextArea(10,10);
		p1.add(ta1);
		
		p3.setLayout(new GridLayout(4,3));
		p3.setBackground(Color.GRAY);
		for(int i=1;i<=9;i++)
		{
			b=new JButton(Integer.toString(i));
			p3.add(b);
			b.setBackground(Color.lightGray);
			b.setFont(new Font("Times New Roman",Font.BOLD,56));
		}	
		b.addActionListener(this);
		bclr=new JButton("C");
		bclr.setFont(new Font("Times New Roman",Font.BOLD,56));
		p3.add(bclr);
		bclr.setBackground(Color.ORANGE);
		
		bzero=new JButton("0");
		bzero.setFont(new Font("Times New Roman",Font.BOLD,56));
		p3.add(bzero);
		bzero.setBackground(Color.LIGHT_GRAY);
		
		baclr=new JButton("AC");
		baclr.setFont(new Font("Times New Roman",Font.BOLD,56));
		p3.add(baclr);
		baclr.setBackground(Color.ORANGE);
		getContentPane().add(p3,BorderLayout.CENTER);
		
		getContentPane().add(p4,BorderLayout.EAST);
		p4.setBackground(Color.CYAN);
		p4.setLayout(new GridLayout(4,1));
		badd=new JButton("    +    ");
		badd.setBackground(Color.CYAN);
		bsub=new JButton("    -    ");
		bsub.setBackground(Color.CYAN);
		bmulti=new JButton("    x    ");
		bmulti.setBackground(Color.CYAN);
		bdiv=new JButton("    /    ");
		bdiv.setBackground(Color.CYAN);
		badd.setFont(new Font("Times New Roman",Font.BOLD,56));
		bsub.setFont(new Font("Times New Roman",Font.BOLD,56));
		bmulti.setFont(new Font("Times New Roman",Font.BOLD,56));
		bdiv.setFont(new Font("Times New Roman",Font.BOLD,56));
		p4.add(badd);
		p4.add(bsub);
		p4.add(bmulti);
		p4.add(bdiv);
		
		p5.setBackground(Color.CYAN);
		getContentPane().add(p5,BorderLayout.WEST);
		p5.setLayout(new GridLayout(4,1));
		bsin=new JButton("sin(x)");
		bsin.setBackground(Color.CYAN);
		btan=new JButton("tan(x)");
		btan.setBackground(Color.CYAN);
		bsqr=new JButton("sqr(x)");
		bsqr.setBackground(Color.CYAN);
		bsqrt=new JButton("sqrt(x)");
		bsqrt.setBackground(Color.CYAN);
		bsin.setFont(new Font("Times New Roman",Font.BOLD,56));
		btan.setFont(new Font("Times New Roman",Font.BOLD,56));
		bsqr.setFont(new Font("Times New Roman",Font.BOLD,56));
		bsqrt.setFont(new Font("Times New Roman",Font.BOLD,56));
		p5.add(bsin);
		p5.add(btan);
		p5.add(bsqr);
		p5.add(bsqrt);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		ta1.setText(s);
		
	}
	public static void main(String args[]) {
		new Calculator1();
	}
}
