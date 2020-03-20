import java.net.*;
import java.io.*;

public class TCPClient
{
	private Socket socket=null;
	private DataInputStream dis=null;
	private DataOutputStream dos=null;
	
	public TCPClient(String hostName,int port)
	{
		try
		{
		
			socket=new Socket(hostName,port);
		
			dis=new DataInputStream(System.in);
			dos=new DataOutputStream(socket.getOutputStream());
		
			String line="";
			while(!line.equals("Over"))
			{
				line=dis.readLine();
				dos.writeUTF(line);
			}
			dis.close();
			dos.close();
			socket.close();
		}
		catch(UnknownHostException uhe)
		{
			System.out.println("An error occured due to : "+uhe);
		}
		catch(IOException ie)
		{
			System.out.println("An error occured due to : "+ie);
		}
		catch(Exception e)
		{
			System.out.println("An error occured due to : "+e);
		}
	}
	public static void main(String args[]) throws Exception
	{
		new TCPClient("127.0.0.1",4000);
	}
}