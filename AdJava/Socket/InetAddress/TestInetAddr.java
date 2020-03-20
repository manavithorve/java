import java.net.*;
class TestInetAddr
{
	public static void main(String args[]) throws UnknownHostException
	{
		try
		{
			InetAddress local=InetAddress.getLocalHost();
			System.out.println("\nAddress of local host is :"+local);
			
			
			InetAddress name=InetAddress.getByName("DESKTOP-1NINA3C");
			System.out.println("\nName : DESKTOP-1NINA3C |  Address: "+name);
			
			InetAddress[] all=InetAddress.getAllByName("DESKTOP-1NINA3C");
			System.out.println("\nAll address for DESKTOP-1NINA3C are : ");
			for(int i=0;i<all.length;i++)
			{
				System.out.println("Address "+(i+1)+": "+all[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}