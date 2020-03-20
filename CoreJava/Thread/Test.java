class Prime extends Thread
{
	int num;
	int flag=0;
	String PrimeNo="";
	public void run()
	{
	for(int num=2;num<=100;num++)
	{
		flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			PrimeNo=PrimeNo+num+" ";	
		}	
	}
	System.out.println(PrimeNo);
	}
}
class Test
{
	public static void main(String args[])
	{
		Prime p=new Prime();
		p.start();
	}
}
