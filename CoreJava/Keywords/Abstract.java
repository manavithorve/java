/*Abstract class have at least one abstract method and this allows us to override the method*/
/*Abstarct method does not have body it just have declaration and defination is implemented in subclass*/
/*Any class that inherits abstract class have to redefine the abstract method*/
/*If a class contains abstract method the class by default make as abstarct*/
/*We cannot create the object of abstract class directly we can create the references and use it to point the object of child classes*/
/*Variables Cannot be Absract*/
/*We cannot create the abstract constructor or abstract static method*/ 
abstract class Base
{
	protected int a,b;
	Base()
	{
		a=10;
		b=20;
	}
	abstract void show();	
}
class Derived1 extends Base
{
	public void show()
	{
		System.out.println("Value of a is :"+a);
	}
}
class Derived2 extends Base
{
	public void show()
	{
		System.out.println("Value of b is :"+b);
	}
	public void display()
	{
		System.out.println("Value of a is "+a);
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Derived1 d1=new Derived1();
		d1.show();
		Derived2 d2=new Derived2();
		d2.display();
		d2.show();
	}
}