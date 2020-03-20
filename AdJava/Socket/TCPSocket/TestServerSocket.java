import java.net.*;
import java.io.*;

public class TestServerSocket 
{
	ServerSocket sSocket;
	Socket socket;
	BufferedReader br;
	
	public TestServerSocket() throws Exception
	{
		sSocket=new ServerSocket(123);
		System.out.println("Server Started... ");
		while(true)
		{
			socket=sSocket.accept();
			System.out.println("Got Client : "+socket.getInetAddress().toString());
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str=br.readLine();
			System.out.println("Client Says : "+str);
		}
	}
	public static void main(String args[]) throws Exception
	{
		new TestServerSocket();
	}
}