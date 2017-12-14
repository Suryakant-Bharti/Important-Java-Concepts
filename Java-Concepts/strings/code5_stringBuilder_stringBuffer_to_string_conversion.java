// Java program to demonstrate conversion from 
// String to StringBuffer and StringBuilder.
public class Test 
{
	public static void main(String[] args)
	{
		StringBuffer sbr = new StringBuffer("GeeksBuffer");
		
		// conversion from StringBuffer object to String
		String str = sbr.toString();
		System.out.println(str);
		
		StringBuilder sbl = new StringBuilder("GeeksBuilder");
		
		// conversion from StringBuilder object to String
		String str1 = sbl.toString();
		System.out.println(str1);

	}
}