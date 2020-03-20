interface if1
{
	int deptNo=06;
	String deptName="Computer";
	void display();
}
class c1 implements if1
{
	int classNo;
	String classTeacher;
	public c1(int classNo,String classTeacher)
	{
		this.classNo=classNo;
		this.classTeacher=classTeacher;	
	}
	public void display()
	{
		System.out.println("Department Code= "+deptNo);
		System.out.println("Department Name= "+deptName);
		System.out.println("Class Number= "+classNo);
		System.out.println("Class Teacher Name= "+classTeacher);
	}
}
class student extends c1
{
	int rollNo;
	String name;
	public student(int rollNo,String name)
	{
		super(2,"abc");
		this.rollNo=rollNo;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Student Roll No= "+rollNo);
		System.out.println("Student Name= "+name);
		System.out.println("Class Number= "+classNo);
		System.out.println("Class Teacher Name= "+classTeacher);
		System.out.println("Department Code= "+deptNo);
		System.out.println("Department Name= "+deptName);
	}
}
class CImpSCExt
{
	public static void main(String args[])
	{
		student s1=new student(101,"Manavi");
		s1.display();
	}
}