import java.rmi.*;
import java.rmi.server.*;

public class AddRemote extends UnicastRemoteObject implements MyInterface
{
	public AddRemote() throws RemoteException
	{
		super();
	}
	public int add(int a,int b)throws RemoteException
	{
		return (a+b);
	}
}