class Reference
{
	int eid;
	String ename;
	double esal;

	public void display()
	{
		int deptNo=0;
		System.out.println("Emp Id "+eid);
		System.out.println("Emp Name "+ename);
		System.out.println("Emp Sal "+esal);
	}
}

public class TestReference
{
	public static void main(String args[])
	{
		Reference r=new Reference();
		r.eid=10;
		r.ename="Manavi";
		r.esal=10000;
		r.display();
		Reference r1=r;
		System.out.println("----------------------------------");
		r1.eid=20;
		r1.ename="Shivani";
		r1.esal=100;
		r1.display();
		System.out.println("----------------------------------");
		r.display();
	}
}