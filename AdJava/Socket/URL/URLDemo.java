import java.net.*;

public class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
		URL url=new URL("http://www.google.com:80/downloads");
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Port: "+url.getPort());
		System.out.println("Host: "+url.getHost());
		System.out.println("File: "+url.getFile());
		System.out.println("Ext: "+url.toExternalForm());
	}
}