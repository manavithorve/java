import java.rmi.*;
import java.net.*;
import java.rmi.server.*;

public class Client 
{
	public static void main (String args[])
	{
		try
		{
			MyInterface stub= (MyInterface)Naming.lookup("rmi://localhost:5001/abc");
			System.out.println("Addition is : "+stub.add(10,20));
			System.out.println("Substraction is : "+stub.sub(20,10));
		}
		catch(Exception e)
		{
			System.out.println("An error Occured due to: "+e);
		}
	}	
}