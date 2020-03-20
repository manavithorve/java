class Constructor 
{
int l,b;

	public Constructor()		//default;
	{
		System.out.println("--------------Default Constructor--------------");
		l=10;
		b=20;
	}
	public Constructor(int l,int b)
	{
		System.out.println("--------------Parametric Constructor--------------");
		this.l=l;
		this.b=b;
	}
	public Constructor(Constructor c)
	{
		System.out.println("--------------Reference Constructor--------------");
		this.l=c.l; //imp
		this.b=c.b;
	}
	public void display()
	{
		System.out.println("Length is : "+l);
		System.out.println("Breadth is : "+b);
	}
}
class TestConstructor 
{
	public static void main(String args[])
	{
		Constructor c1=new Constructor();	//default
		c1.display();
		Constructor c2=new Constructor(30,40);	//parametric
		c2.display();
		Constructor c3=new Constructor(c2);	//reference
		c3.display();	
	}
}
