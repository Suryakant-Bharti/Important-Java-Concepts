// Java program to demonstrate difference between String, StringBuilder and StringBuffer

// String is immutable, if you try to alter their values, another object gets created, 
// whereas StringBuffer and StringBuilder are mutable so they can change their values.

class Geeksforgeeks
{
	// Concatenates to String
	public static void concat1(String s1)
	{
		s1 = s1 + "forgeeks";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2)
	{
		s2.append("forgeeks");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3)
	{
		s3.append("forgeeks");
	}

	public static void main(String[] args)
	{
		String s1 = "Geeks";
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Geeks");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Geeks");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
	}
}
