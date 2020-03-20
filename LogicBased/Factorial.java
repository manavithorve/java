import java.util.Scanner;
class Fact 
{
	public Fact()
	{
		System.out.println("------Factorial------\n");
	}	
	public int factorialOf(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else 
		{
			return (n*factorialOf(n-1));
		}
	}
}
public class Factorial 
{
	public static void main(String args[])
	{
		Fact f=new Fact();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("Factorial of " +n+ " is: "+f.factorialOf(n));
	}
}
