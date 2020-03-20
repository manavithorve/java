import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int no,cnt=0;
		Scanner sc=new Scanner(System.in);			
		System.out.println("Enter a number");
		no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{	
				cnt++;
			}	
		}
		if(cnt==2)
			{
				System.out.println("It is a Prime Number");
			}
			else
			{
				System.out.println("It is not a Prime Number");
			}
	}
}
