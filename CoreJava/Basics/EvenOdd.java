import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int even[]=new int[10];
		int odd[]=new int[10];
		int cnte=0,cnto=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers in Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]%2==0)
				{
				for(int j=0;j<arr.length;j++)
				{	
				even[j]=arr[i];
				}	
				cnte++;
				}
				else
				{
				for(int j=0;j<arr.length;j++)
				{	
				odd[j]=arr[i];
				}	
				cnto++;
				}		
		}
		System.out.println("-----------------------------------------");
		System.out.println("Even numbers in array are :");
		for(int j=0;j<even.length;j++)
		{
		System.out.println(even[j]);
		}
		System.out.println("Total Even Numbers in Array Are : "+cnte);
		System.out.println("-----------------------------------------");
		System.out.println("Odd numbers in array are :");
		for(int j=0;j<odd.length;j++)
		{
		System.out.println(odd[j]);
		}
		System.out.println("Total Odd Numbers in Array Are : "+cnto);
	}
}