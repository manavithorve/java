import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int n,no,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		no=sc.nextInt();
		n=no;
		while(n!=0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		if(no==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}