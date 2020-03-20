interface inf1
{
	int if1=10;
	void display(); 
}
interface inf2 extends inf1
{
	int if2=20;
	void display();
}
class c11 implements inf2
{
	int c=30;
	public void display()
	{
		System.out.println("if1: "+if1);
		System.out.println("if2: "+if2);
		System.out.println("c: "+c);
	}
}
class IfExtCImp
{
	public static void main(String args[])
	{
		c11 c1=new c11();
		c1.display();
	}
}