import java.util.*;
class CommandLineReverse
{
	public static void main(String args[])
	{
		int add=0;
		for(int i=args.length-1;i>=0;i--)
		{	
			System.out.println(args[i]);
		                add=add+Integer.parseInt(args[i]);
		}
		System.out.println("Addition of Numbers : "+add);
	}
}