import java.util.*;
class TestVector 
{
	public static void main (String args[])
	{
		Vector v1=new Vector();//Default size is 10
		int len=args.length;
		for(int i=0;i<len;i++)
		{
			v1.addElement(args[i]);
		}
		v1.insertElementAt("Manavi",2);
		int size1=v1.size();
		System.out.println("Size is :-"+size1);
		String arr[]=new String[size1];
		v1.copyInto(arr);
		System.out.println("List of Elements is : -");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}		
	}
}