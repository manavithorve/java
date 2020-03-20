import java.util.Scanner;
class Switch
{
	public void check()
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:-");
		System.out.println("1-Employee \t2-Developer \t3-Manager");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Your salary is 20000");
				break;
			case 2: System.out.println("Your salary is 30000");
				break;
			case 3: System.out.println("Your salary is 40000");
				break;
			default:System.out.println("Invalid Choice");
		}
	}
}	
class TestSwitch
{
	public static void main(String args[])
	{
		Switch s1=new Switch();
		s1.check();	
	}	
}