/*static block is the one which executes before invokation of constructor though when object is created the constructor is invoked the static block has highest priority */
/*The normal block come after static block which when used also executes before contructor*/
class StaticBlock
{
	static
	{
		System.out.println("static block in class..........");
	}
	StaticBlock()
	{
		System.out.println("Constructor.........");
	}
	void show()
	{
		System.out.println("Show Method....");
	}
}

class TestStaticBlock
{
	static 
	{
		System.out.println("Before Main static Block......");
	}
	
	{
		System.out.println("Normal Block"); 
	}
	public static void main(String args[])
		{
			System.out.println("Before Method");
			StaticBlock b1=new StaticBlock();
			b1.show();
			System.out.println("After Main.......");
		}
}