import java.net.*;
import java.io.*;

public class TCPServer
{
	private ServerSocket server=null;
	private Socket socket=null;
	private DataInputStream dis=null;

	public TCPServer (int port)
	{
		try
		{
			//creating server socket 
			server=new ServerSocket(4000);
			System.out.println("Server started...waiting for client...");
		
			//accepting client connection 
			socket=server.accept();
			System.out.println("Client Accepted...");
			
			//creating inputstream reader
			dis=new DataInputStream(new BufferedInputStream(socket.getInputStream()));	

			String line="";
			
			//continue till "Over"
			while(!line.equals("Over"))
			{
				try
				{
					//read line 
					line= dis.readUTF();
					//print line
					System.out.println(line);
				}	
				catch(IOException ie)
				{
					System.out.println("An error occured due to"+ie);
				}
			}
			System.out.println("Closing Connection...");
			//close connection 
			socket.close();
			dis.close();
		}
		catch(IOException ie)
		{
			System.out.println("An error occured due to : "+ie);
		}
	}
	public static void main(String args[]) throws Exception
	{
		//start server
		new TCPServer(4000);
	}
}