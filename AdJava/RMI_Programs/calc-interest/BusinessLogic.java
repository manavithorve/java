import java.rmi.*;
import java.rmi.server.*;

public class BusinessLogic extends UnicastRemoteObject implements MyInterface
{
	public BusinessLogic()throws RemoteException
	{
		super();
	}
	public double calcInterest(int principal, int rate, int years)throws RemoteException
	{
		return ((principal*rate*years)/100);
	}
}