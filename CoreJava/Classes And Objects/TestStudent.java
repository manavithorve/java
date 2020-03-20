import java.util.*;
class Student
{
//instance variables;
int sid;
String sname;
int s1,s2,s3;
double tot,per;
	
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number ");
		sid=sc.nextInt();
		System.out.println("Enter Name of Student ");
		sname=sc.next();
		System.out.println("Enter the marks of Three Subjects ");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s2=sc.nextInt();
	}
	public void calcData()
	{
		tot=s1+s2+s3;
		per=tot/3;
	}
	public void displayData()
	{
		System.out.println(+sid+"\t\t"+sname+"\t\t"+tot+"\t\t"+per);
	}
}

class TestStudent
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.acceptData();
		s.calcData();
		System.out.println("ID\t\tNAME\t\tTOTAL\t\tPERCENT");
		System.out.println("--------------------------------------------------------------------------------");
		s.displayData();
		System.out.println("--------------------------------------------------------------------------------");

	}
}
