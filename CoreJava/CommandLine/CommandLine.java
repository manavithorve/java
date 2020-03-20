import java.util.*;
class CommandLine
{
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int add=n1+n2;
		System.out.println("Addition is :"+add);
	}	
}