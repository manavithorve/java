/*Single Inheritance*/
class A
{
	protected int n1,n2;
	A()
	{
		System.out.println("A Constructor");
		n1=10;
		n2=20;
	}
	protected void display()
	{
		System.out.println("Accessing Method with object of Inherited class ");
		System.out.println("Value of n1 is "+n1);
		System.out.println("Value of n2 is "+n2);
		System.out.println("---------------------------------------------------------------------------");
	}
}
class B extends A
{
	int n3;
	B()
	{
		super();//		this should be the first line if used;
		System.out.println("B Constructor");
		n3=70;
	}
	public void show()
	{
		System.out.println("Value of n1 is "+n1);
		System.out.println("Value of n2 is "+n2);
		System.out.println("Value of n3 is "+n3);	
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		System.out.println("In Main");
		B b=new B();/*First Constructor of class A is called,values are initialized then 
			     constructor of class B is called and values are assigned*/
		b.display();//calling A's method
		b.show();
	}
}
