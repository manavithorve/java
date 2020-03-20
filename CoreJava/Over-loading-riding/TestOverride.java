class BaseOverride
{
	int length;
	public BaseOverride(int length)
	{
		this.length=length;	
	}
	public void findArea()
	{
		System.out.println("This is base class and length is "+length);
	}
}
class DerivedOverride extends BaseOverride
{
	int breadth;
	public DerivedOverride(int len,int breadth)
	{
		super(len);
		this.breadth=breadth;
	}
	public void findArea()
	{
		System.out.println("This is Derived class and length is "+length);
		System.out.println("This is Derived class and breadth is "+breadth);	
	}	
}
class TestOverride
{
	public static void main(String args[])
	{
	DerivedOverride d1=new DerivedOverride(10,20);
	d1.findArea();
	}
}