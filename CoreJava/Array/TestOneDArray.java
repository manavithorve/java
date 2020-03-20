import java.util.*;
class TestOneDArray
{
	public static void main(String args[])
	{
	int arr[]=new int[10]; //declaring an array
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 Numbers");
	for(int i=0;i<arr.length;i++)
	{	
		arr[i]=sc.nextInt();
	}
	System.out.println("Numbers You Entered Are :");
	for(int i : arr)
	{
		System.out.println(i);
	}
	System.out.println("-------------------------------------------------------------");
	System.out.println("Number you Entered in reversed order are");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	}
}