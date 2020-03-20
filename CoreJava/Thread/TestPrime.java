class Prime
{
	int num;
	int cnt=0;
	String primeNo=" ";
	public void prime()
	{
		for(int i=1;i<=100;i++)
		{
			for(num=i;num<=100;num++)
			{
				if(i%num==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				primeNo=primeNo+i+" ";
			}
		}
		System.out.println(primeNo);

	}	
}
class TestPrime
{
	public static void main(String args[])
	{
		Prime p=new Prime();
		p.prime();
	}
}