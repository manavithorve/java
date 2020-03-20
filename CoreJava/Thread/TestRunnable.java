class RunnableThread implements Runnable
{
	String str;
	public RunnableThread(String str)
	{
		this.str=str;
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		System.out.println("String is "+str);
	}
}
class TestRunnable
{
	public static void main(String args[])
	{	
		RunnableThread rt=new RunnableThread("Manavi");
	}
}