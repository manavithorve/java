class TwodArray
{	
	int arr1[][]={{1,2},{3,4}};
	int arr2[][]={{2,3},{4,5}};
	int arr3[][]=new int[2][2];
		
		void add()
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];//addition
				}
			}
		}
		
		void multi()
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					for(int k=0;k<i;k++)
					{
						arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[j][k]);
					}
				}
			}
		}
		
		void transpose()
		{
			System.out.println("------Original------");
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					System.out.print(arr1[i][j]+"\t");
				}
				System.out.println("\n");
			}
			System.out.println("------Transpose------");
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					arr3[i][j]=arr1[j][i];
				}
			}
		}

		void display()
		{
			for(int i=0;i<arr3.length;i++)
			{
					for(int j=0;j<arr3[i].length;j++)
					{
						System.out.print(arr3[i][j]+"\t");
					}
					System.out.println("\n");
			}
		}
}

class ArrayOperations
{
	public static void main(String args[])
	{	
	 	TwodArray t1=new TwodArray();
		System.out.println("-------------------------------------------------------------");
		t1.add();
		t1.display();
		System.out.println("-------------------------------------------------------------");
		t1.multi();
		t1.display();
		System.out.println("-------------------------------------------------------------");
		t1.transpose();
		t1.display();
		System.out.println("-------------------------------------------------------------");
	}
}
