import java.rmi.*;
import java.rmi.registry.*;

public class Server 
{
	public static void main (String args[])
	{
		try
		{
			MyInterface stub= new BusinessLogic();
			Naming.rebind("rmi://localhost:5002/abc",stub);
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
			System.out.println("An error occured due to : "+e);
		}
	}
}