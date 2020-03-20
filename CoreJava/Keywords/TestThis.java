class This
{
	int n1;
	This()
	{
		this(10);				//call Constructor within another Constructor
		System.out.println("Value of n1 is : "+n1);
		System.out.println("Hiiiii");
		n1=20;
		System.out.println("Value of n1 is : "+n1);
	}
	This(int n1)
	{
		//this(t1);
		//System.out.println("Parameter");
		this.n1=n1;
					//Avoids ambiguity between instance variable and formal parameter
	}
	This(This t)
	{
		System.out.println("Hello");
		this.n1=t.n1;			//this means current object
		System.out.println("Value of n1 is : "+n1);
	}
}
class TestThis
{
	public static void main(String args[])
	{
		This t1=new This();
		This t2=new This(t1); 
	}
}