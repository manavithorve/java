interface face
{
	int val0=5;
	void display();
}
interface face1 extends face
{
	int val=10;
	void display();
}
class demoClass1 implements face1
{
	int val1=20;
	public void display()
	{
		System.out.println("Val = "+val);
		System.out.println("Val1 = "+val1);
		System.out.println("Val0 = "+val0);	
	}
}
class demoClass2 implements face1
{
	int val2=30;
	public void display()
	{
		System.out.println("Val = "+val);
		System.out.println("Val2 = "+val2);
		System.out.println("Val0 = "+val0);	
	}
}
class demoClass3 extends demoClass1
{
	int val3=40;
	public void display()
	{
		System.out.println("Val0= "+val0);
		System.out.println("Val1= "+val1);
		System.out.println("val3= "+val3);
	}
}
class EIIE
{
	public static void main(String args[])
	{
		demoClass1 dc11=new demoClass1();
		dc11.display();
		demoClass2 dc21=new demoClass2();
		dc21.display();
		demoClass3 dc31=new demoClass3();
		dc31.display();	
	}
}