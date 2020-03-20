import java.rmi.*;

public class Client
{
	public static void main(String args[])
	{
		try
		{
			MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5002/abc");
			System.out.println("Simple Interest is:"+stub.calcInterest(5000,200,2));
		}
		catch(Exception e)
		{
			System.out.println("An error occured due to : "+e);
		}
	}
}