/*static keyword is used to make the variables and methods static*/
/*When the varible is static it's memory is allocated only once that means all the object share the memory for the static variable*/
/*When the value is assinged to a static variable it is not changed until the new object is created*/
/*We can directly access the static variables and methods using the class name and variable or method name seperated by dot*/
/*Static method contains only static variables if we want to use nonstatic variables in static method we have to create an instatce of class and access them using the class name*/
/*To call a static method we need not have to create the object we can directly call the method using class name*/
/*static block have the highest priority it can execute before main method as it executes very first we do not have to call it after static the normal block has highest priority*/\
/*static import is the concept introduced in java ver5 which is used to import the static variables in class within a package*/
class Static
{
	int n1;
	static int n2;
	Static(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;	
	}
	void display()
	{
		System.out.println("Value of n1 is : "+n1);
		System.out.println("Value of n2 is : "+n2);
	}
}

class TestStatic
{
	public static void main(String args[])
	{
		Static s1=new Static(10,10);
		s1.display();//10,10
		Static s2=new Static(20,20);
		s2.display();//20,20
		s1.display();//10,20
	}
}