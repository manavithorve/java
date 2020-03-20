import java.io.*;
import java.net.*;

public class TestClientSocket
{
	Socket socket;
	PrintWriter pw;
	BufferedReader br;
	String str;

	public TestClientSocket() throws Exception
	{
		socket=new Socket("localhost",123);
		br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		pw=new PrintWriter(socket.getOutputStream());
		pw.println(str);
		System.out.println(pw.checkError());
	}
	
	public static void main(String args[]) throws Exception
	{
		new TestClientSocket();
	}
}