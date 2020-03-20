import java.util.*;
class ArrayObj
{
int eid;
String ename;
double esal;
	
	public void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Employee ID");
		eid=sc.nextInt();
		System.out.println("Enter The Employee Name");
		ename=sc.next();
		System.out.println("Enter The Employee Salary");
		esal=sc.nextDouble();
	}
	public void Display()
	{
		System.out.println(eid+"\t\t"+ename+"\t\t"+esal);
	}
}
class TestArrayObj
{
	public static void main(String args[])
	{
		ArrayObj a[]=new ArrayObj[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new ArrayObj();
			a[i].Accept();
		}
		System.out.println("ID\t\tNAME\t\tSALARY");
		for(ArrayObj a1:a)
		{
			System.out.println("------------------------------------------------------------");f
			a1.Display();
		}
	}

}
