//concatenation of two files can be done through SequenceInputStream
import java.io.*;
class SequenceInputStreams
{
	public static void main(String args[])
	{
		try
		{
		FileInputStream fis1=null;
		FileInputStream fis2=null;
		SequenceInputStream sis=null;

		fis1=new FileInputStream("Welcome.txt");
		fis2=new FileInputStream("DataInput.txt");

		sis=new SequenceInputStream(fis1,fis2);

		BufferedInputStream inBuffer=new BufferedInputStream(sis);
		BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);
		int ch,ch1;

		while((ch=inBuffer.read())!=-1)
		{
			outBuffer.write((char)ch);
			System.out.print((char)ch);
		}	
		System.out.println();
		System.out.println("Files Concatenated");
		}
		catch(Exception e)
		{ }
	}
}