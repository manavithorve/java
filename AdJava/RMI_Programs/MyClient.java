import java.rmi.*;
public class MyClient 
{
	public static void main(String args[])
	{
		try
		{
			MyInterface mi=(MyInterface)Naming.lookup("rmi://localhost:5000/manavi");
			System.out.println("Addition is: "+mi.add(10,20));
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}