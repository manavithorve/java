//Used to store and retrive primitive type of data
//The input and output stream file must be same
import java.io.*;
class DataInputOutputStream
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("D:/CoreJava/File Handling/Byte Stream/DataOutput.txt");
		DataOutputStream dos=new DataOutputStream(fos);
	
		dos.writeInt(101);
		dos.writeFloat(1.1f);
		dos.writeBoolean(true);

		//data is written in file in the form of object or in encrypted form
		
		System.out.println("Primitive Datatype is Written");
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("D:/CoreJava/File Handling/Byte Stream/DataOutput.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		int n=dis.readInt();
		float f=dis.readFloat();
		boolean b=dis.readBoolean();
	
		System.out.println("Data is : "+n+"\t"+f+"\t"+b+"\t");
	}
}