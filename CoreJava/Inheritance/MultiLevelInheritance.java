class GrandFather
{
	protected int gage;
	public GrandFather(int gage)
	{
		this.gage=gage;
	}
	public void show()
	{
		System.out.println("GrandFather age is : "+gage);
	}
}
class Father extends GrandFather
{
	protected int fage;
	public Father(int fage)
	{
		super(fage+30);
		this.fage=fage;
	}
	public void show()
	{
		super.show();// to avoid recursive call to methods
		System.out.println("Father age is : "+fage);
	}
}
class Son extends Father
{
	private int sage;
	public Son(int sage)
	{
		super(sage+30);
		this.sage=sage;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Son age is : "+sage);
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		Son s1=new Son(15);
		s1.show();
	}
}