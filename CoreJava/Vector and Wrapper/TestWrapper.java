class TestWrapper
{
	public static void main(String args[])
	{
		int iv1=10;
		float fv1=20.0f;
		Integer i1=new Integer(iv1);
		System.out.println("Object of class Integer "+i1);
		Float f2=new Float(fv1);
		System.out.println("Object of class Float "+f2);
		int v3=f2.intValue();
		System.out.println("Primitive Integer Converted from an object of "+v3);
		String str1;
		str1=Integer.toString(iv1);
		System.out.println("Integer Converted Into String "+str1);
		Double dv1=Double.valueOf(str1);
		System.out.println("String to Double Object "+dv1);
		
	}
}