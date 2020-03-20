/*To prevent reusability of the the variables or method we can use final keyword*/
/*If a class is final we it cannot be inherited*/
/*If a method is final it cannot be overridden*/
/*If a variable is final it's value cannot be changed*/
/*Final method contains only final variables if we want to access non final variables we have to create the instance of the class and use them*/
/*Constructor cannot be final*/

final class Base
{
	final int a;
	Base(int a)
	{	
		this.a=a;
	}
	final void display()
	{
		System.out.println("Value of a is : "+a);
	}
}
class Derived extends Base //error cannot inherit Base it is final
{
	Derived()
	{
	super(10);
	}
	void display() //error cannot override the final method
	{
	super.display();
	a=11; //error cannot redefine final variable
	System.out.println("Value of a is :"+a);
	}
}
class Final
{
	public static void main(String args[])
	{
	Derived d=new Derived();
	d.show();
	}
}