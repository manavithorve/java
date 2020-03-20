class Overload
{
	public double CalcArea(int l,float b)
	{
		return (l*b);	
	}
	public double CalcArea(float r)
	{
		return(3.14f*r*r);
	}
	public double CalcArea(float bs,int h)
	{
		return(0.5f*bs*h);
	}
}

class TestOverload
{
	public static void main(String args[])
	{
		double area;
		Overload o=new Overload();
		area=o.CalcArea(10,20.0f);
		System.out.println("-------------------------------------------");
		System.out.println("Area is : "+area);
		Overload o1=new Overload();
		area=o1.CalcArea(2.0f);
		System.out.println("-------------------------------------------");
		System.out.println("Area is : "+area);
		Overload o2=new Overload();
		area=o2.CalcArea(10.0f,20);
		System.out.println("-------------------------------------------");
		System.out.println("Area is : "+area);
		
	}
}