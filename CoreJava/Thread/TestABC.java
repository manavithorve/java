class A extends Thread
{
	public void run()
	{
		System.out.println("This is from thread A");
		for(int i=0;i<=5;i++)
		{	
			if(i==3)
			{
				System.out.println("We are Swiching");
				yield();
			}
			System.out.println("A= "+i);
		}
		System.out.println("Exit From A");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("This is from thread B");
		for(int i=0;i<=5;i++)
		{
			if(i==2)
			{
				try
				{
					System.out.println("Sleeping Thread");
					sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println("B= "+i);
		}
		System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("This is from thread C");
		for(int i=0;i<=5;i++)
		{
			if(i==4)
			{
				stop();
			}
			System.out.println("C= "+i);	
		}
		System.out.println("Exit from C");
	}
}
class TestABC
{
	public static void main(String args[])
	{
		System.out.println("Main ..");
		new A().start();
		new B().start();
		new C().start();
		System.out.println("Exit from Main");
	}
}