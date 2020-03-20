import java.lang.Thread;
class AT extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)
			{
				yield();
			}
			System.out.println("Thread A : i= "+i);
		}
		System.out.println("Exit from A");
	}
}
class BT extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("Thread B : j= "+j);
			if(j==3)
			{
				//stop();
			}
		}
		System.out.println("Exit from B");
	}
}
class CT extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
			if(k==1)
			{
				try
				{
					sleep(10);
				}
				catch(Exception e)
				{
					System.out.println("Error");
				}	
			}
		}
		System.out.println("Exit from C");
	}
}
class TestThreadMethods
{
	public static void main(String args[])
	{
		System.out.println("---------------------------------------------------");
		AT a1=new AT();
		BT b1=new BT();
		CT c1=new CT();
		System.out.println("Start Thread A");
		a1.start();
		System.out.println("Start Thread B");
		b1.start();
		System.out.println("Start Thread C");
		c1.start();
		System.out.println("---------------------------------------------------");	
	}
}