/*Theory in TestStatic.java*/
class StaticMethod
{
 static int n1;
int n2;
	StaticMethod()	
	{
	 n1=10;
	 n2=20;	
	}
	static void show()
	{
		StaticMethod s=new StaticMethod();
		System.out.println("Value of n1 is "+n1);
		System.out.println("Value of n2 is "+s.n2);
	}
}
class TestStaticMethod
{
	public static void main(String args[])
	{
		StaticMethod.show();
	}
}
