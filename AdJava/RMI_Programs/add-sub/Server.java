import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class Server 
{
	public static void main(String args[])
	{
		try
		{
			MyInterface stub= new BusinessLogic();
			Naming.rebind("rmi://localhost:5001/abc",stub);
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
			System.out.println("An Error Occured due to : "+e);
		}
	}	
}