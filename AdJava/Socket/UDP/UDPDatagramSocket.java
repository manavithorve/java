import java.net.*;
import java.io.*;

public class UDPDatagramSocket
{
	public static int serverPort=998;
	public static int clientPort=999;
	public static int bufSize=1024;
	public static byte buffer[]=new byte[bufSize];
	public static DatagramSocket ds;
	
	public static void sendingServer()throws IOException
	{
		int pos=0;
		while(true)
		{
			int c=System.in.read();
			switch(c)
			{
				case -1: System.out.println("Server Quits ...");
				return;
				
				case '\r': 
				break;
				
				case '\n': ds.send(new DatagramPacket(buffer,bufSize,InetAddress.getLocalHost(),clientPort));
							System.out.println("Packet Sent..!");
				break;
				
				default : buffer[pos++]=(byte)c;
			}
		}
	}
	
	public static void receivingClient()throws IOException
	{
		while(true)
		{
			DatagramPacket p=new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			System.out.println("Packet Received...!");
			System.out.println(new String(p.getData(),0,p.getLength()).trim());
		}
	}
	
	public static void main (String args[])throws Exception
	{
		if(args.length==1)
		{
			ds=new DatagramSocket(serverPort);
			sendingServer();
		}
		else
		{
			ds=new DatagramSocket(clientPort);
			receivingClient();
		}
	}
}