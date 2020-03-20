interface inface1
{
	int val1=101;
	void display();
}
interface inface2 extends inface1
{
	int val2=102;
	void display();
}
interface inface3 extends inface2
{
	int val3=103;
	void display();
}
class cls1
{
	int val4=104;
	public void display()
	{
	}	
}
class cls2 extends cls1 implements inface3
{
	int val5=105;
	public void display()
	{
		System.out.println("Hii");
	}
}
class cls3 extends cls2
{
	int val6=106;
	public void display()
	{
		System.out.println("Inface1      = "+val1);
		System.out.println("Inface2 	= "+val2);
		System.out.println("Inface3	= "+val3);
		System.out.println("Cls1 	= "+val4); 
		System.out.println("Cls2 	= "+val5);
		System.out.println("Cls3	= "+val6);		
	}
}
class EEIEE
{
	public static void main(String args[])
	{
		cls3 c31=new cls3();
		c31.display();
	}
}