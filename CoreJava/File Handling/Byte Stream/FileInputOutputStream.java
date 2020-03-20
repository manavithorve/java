//copying contents of one file to other
import java.io.*;
class FileInputOutputStream
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("Welcome.txt");
		FileOutputStream fos=new FileOutputStream("CopyWelcome.txt");
		int ch;//to read 
		
		while((ch=fis.read())!=-1)
		{
			fos.write(ch);
			System.out.print((char)ch);
		}
		System.out.println();
		System.out.println("File Copy...");
	}
}