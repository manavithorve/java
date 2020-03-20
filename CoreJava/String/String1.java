import java.util.*;
class String1
{
	public static void main(String args[])
	{
	String demo=new String("Hello"); //declare a String..
	String s1=new String(" Manavi ");
	System.out.println("S1: "+s1);
	String ss1=new String("Manavi");

	System.out.println("SS1: "+ss1);
	String s5=s1.trim();			//remove the blank or whitespaces at starting  and ending of  the string
	System.out.println("Trim :"+s5);

	String s2=s5.toLowerCase();		//LowerCase the String 
	System.out.println("Lower Case: "+s2);

	String s3=s5.toUpperCase();		//UpperCase the String
	System.out.println("Upper Case: "+s3);

	String s4=s5.replace('M','m');		//replaces the character m with M
	System.out.println("Replaced : "+s4);

	if(s1.equals(s2))			//checks the equality of strings returns true 
	{
		// _Manavi_ and  Manavi spaces are included so not same 
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not Same");
	}

	if(ss1.equalsIgnoreCase(s5))		//checks equality without considering the case 
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not Same");
	}

	int len=s1.length();				//returns the length of String
	System.out.println("Length of S1: "+len);

	int len1=s2.length();				//returns the length of String
	System.out.println("Length of S2: "+len1);

	char c=s1.charAt(4);				//returns character at specified position 
	
	if(s1.compareTo(s2)==0)			//checks equality  
	{
		System.out.println("Both are Same");
	}
	else if(s1.compareTo(s2)>0)
	{
		System.out.println("S2 is Greater");
	}
	else
	{
		System.out.println("S1 is Greater");
	}
	
	String str1=demo.concat(s1);			//joins two Strings
		System.out.println("Concatination : "+str1);

	String str2=s1.substring(0,4);			//creates substring starting from first parameter value upto second parameter value-1
		System.out.println("Substring : "+str2);

	Integer I1=new Integer(10);
		System.out.println("Integer Object:"+I1);
	String str3=String.valueOf(I1);			//Converts Integer object to String using valueOf() method
		System.out.println("String Value of Integer Object: "+str3);
	int i=10;
		System.out.println("Primitive Integer: "+i);
	String str4=Integer.toString(i);			//Converts primitive object to String 
		System.out.println("String value of primitive Integer: "+str4);

	int c1=s1.indexOf('n');			//returns the position of specified character 
		System.out.println("Index of 'n' in String s1 is "+c1);		
	}
	
}