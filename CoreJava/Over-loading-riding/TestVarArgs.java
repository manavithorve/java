/*VarArgs stands for varing arguements, whenever we want to overload a method we have to redefine it but without redefining we can overload a method with the help of varing arguments*/
/*It is also called as variable length arguments*/
/*In VarArgs we declare an array of any type as a parameter and we can call the method by passing 0 to n number of arguements*/
/*This can make the method functional for multiple parameter without defining it multiple times*/
/*We can use any other type of data with VarArgs but the varargs should be last pararmeter*/
/*We cannot declare two arrays as Varying Arguements*/
/*The ellipsis(...) operator is used to define the array with var args */

class VarArgs
{
	public void display(float f,int...n)
	{
		System.out.println(f);
		for(int i:n)
		{
			System.out.println(i);
		}
	}
}
class TestVarArgs
{
	public static void main(String args[])
	{
		VarArgs v=new VarArgs();
		v.display(1.10f,1,2,3,4,5);
		System.out.println("--------------------");
		v.display(2.1f,2,2,4);
		System.out.println("--------------------");
		v.display(1.4f,1,6);
	}
}