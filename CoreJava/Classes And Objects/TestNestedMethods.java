class NestedMethods
{
	public void Method()
	{
		System.out.println("This is Method");
		Nested();
	}
	public void Nested()
	{
			System.out.println("This is Nested Method");
	}
}
class TestNestedMethods
{
	public static void main(String args[])
	{
		System.out.println("This is main method");
		NestedMethods nm=new NestedMethods();
		nm.Method();
	}
}
