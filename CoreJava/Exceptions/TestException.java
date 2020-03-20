class MyException extends Exception
{
	String msg;
	MyException(String msg)
	{
		super(msg);
	}
}
class TestException
{
	public static void main(String args[])
	{
		int n1=10;
		int n2=0;
		int div;
		try
		{
			if(n2==0)
			{
				throw new MyException("Error");
			
			}
			else	
			{
				div=n1/n2;
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());					
		}
	}
}