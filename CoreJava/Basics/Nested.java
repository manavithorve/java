import java.util.*;
class Nested
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String country;
		int age;
		String match="india";
		System.out.println("Enter your Country name ");
		country=sc.next();
		System.out.println("Enter your Age ");
			age=sc.nextInt();
		if(country.compareTo(match)==0)
		{
			
			if(age>=18)
			{
				System.out.println("Valid for Voting");
			}
			else
			{
				System.out.println("Invalid for Voting");
			}
		}
		else
		{
			System.out.println("You are not a Residential Indian");
		}
	}
}