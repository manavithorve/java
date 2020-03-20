import java.util.Scanner;
class DynamicArray
{
public static void main(String args[])
{
	int r1=0,r2=0,c1=0,c2=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows for Matrix1");
	r1=sc.nextInt();
	int arr1[][]=new int[r1][];
	System.out.println("Enter The number of Column for Matrix 1");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println("Enter the Column Numbers for Row Number "+(i+1));
		c1=sc.nextInt();
		arr1[i]=new int[c1];
	}
	System.out.println("Enter the elements in Matrix 1");
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[i].length;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	}

	System.out.println("Enter the number of rows for Matrix2");
	r2=sc.nextInt();
	int arr2[][]=new int[r2][];
	System.out.println("Enter The number of Column for Matrix 2");
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println("Enter the Column Numbers for Row Number "+(i+1));
		c2=sc.nextInt();
		arr2[i]=new int[c2];
	}
	System.out.println("Enter the elements in Matrix 2");
	for(int i=0;i<arr2.length;i++)
	{
		for(int j=0;j<arr2[i].length;j++)
		{
			arr2[i][j]=sc.nextInt();
		}
	}

	if((r1==r2) && (c1==c2))
	{
		System.out.println("Addition is : ");
		int add[][]=new int[r1][c1];
		/*for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				add[i][j]=0;
			}
		}*///this makes the empty spaces as 0
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				add[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<add.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(add[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
	else
	{
		System.out.println("Addition Not Possible... Number of Rows And Columns Of Both Matrix Should Match");
	}	
}
}
