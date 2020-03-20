import java.rmi.*;
import java.rmi.registry.*;

public class MyServer 
{
	public static void main(String args[])
	{
		try
		{
			MyInterface mi=new AddRemote();
			Naming.rebind("rmi://localhost:5000/manavi",mi);
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}	
} 