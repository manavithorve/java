import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class BusinessLogic extends UnicastRemoteObject implements MyInterface
{
	public BusinessLogic() throws RemoteException 
	{
		super();
	}
	public int add(int a,int b)throws RemoteException
	{
		return a+b;
	}
	public int sub(int a,int b)throws RemoteException
	{
		return a-b;
	}	
}
//run command rmic BusinessLogic after compilation.
//run commad start rmiregistry after the above command