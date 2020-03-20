class Thread1 extends Thread
{
	private String str;
	public Thread1(String str)
	{
		this.str=str;
	}
	public void run()//run
	{
		System.out.println("Language "+str);
	}
} 
class Thread2 extends Thread
{
	private String str;
	public Thread2(String str)
	{
		this.str=str;
	}
	public void run()
	{
		System.out.println("Language "+str);
	}
}
class Thread3 extends Thread
{
	private String str;
	public Thread3(String str)
	{
		this.str=str;
	}
	public void run()
	{
		System.out.println("Language "+str);
	}
}
class TestThreads 
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("Java Programming ");
		Thread2 t2=new Thread2("C++ Programming ");
		t1.start();//runnable
		t2.start();
		new Thread3("C Programming ").start();		 
	}
} 
 

