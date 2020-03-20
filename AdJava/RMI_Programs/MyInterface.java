import java.rmi.*;
public interface MyInterface extends Remote
{
	public int add(int a,int b)throws RemoteException;
}