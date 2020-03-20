import java.rmi.*;
import java.net.*;

public interface MyInterface extends Remote
{
	public int add(int a,int b) throws RemoteException;
	public int sub(int a,int b) throws RemoteException;
}