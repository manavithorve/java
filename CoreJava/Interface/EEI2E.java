interface Extending
{
	int val1=101;
	void display();
}
interface Extend1 extends Extending
{
	int val2=102;
	void display();
}
interface Extend2 extends Extending
{
	int val3=103;
	void display();
}
class Ex1 implements Extend1, Extend2
{
	int val4=104;
	public void display()
	{
		System.out.println("Extending   = "+val1);
		System.out.println("Extenn1 	= "+val2);
		System.out.println("Extend2	= "+val3);
		System.out.println("Ex1 	= "+val4); 
	}
}
class Ex2 extends Ex1
{
	int val5=105;
	public void display()
	{
		System.out.println("Extending   = "+val1);
		System.out.println("Extenn1 	= "+val2);
		System.out.println("Extend2	= "+val3);
		System.out.println("Ex1 	= "+val4);
		System.out.println("Ex2 	= "+val5);
	}
}
class EEI2E
{
	public static void main(String args[])
	{
		Ex2 ex21=new Ex2();
		ex21.display();
	}
}
