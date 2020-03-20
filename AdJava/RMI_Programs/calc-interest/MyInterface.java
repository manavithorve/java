import java.rmi.*;
import java.net.*;

public interface MyInterface extends Remote
{
	public double calcInterest(int principal, int rate, int years)throws RemoteException;
}