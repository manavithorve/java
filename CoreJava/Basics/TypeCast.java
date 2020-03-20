class TypeCast
{
	public static void main(String args[])
	{
		float Type1=77.13f;
		int Type2;
		double Type3;
		char Type4;
		System.out.println("Value Of Type1 Float Variable is : "+Type1);
		Type2=(int)(Type1);
		System.out.println("Converted Value Of Type2 Integer Variable is : "+Type2);
 		Type3=(double)(Type1);
		System.out.println("Converted Value Of Type3 Double Variable is : "+Type3);
		Type4=(char)(Type2);
		System.out.println("Converted Value Of Type4 Character Variable is : "+Type4);
	}
}