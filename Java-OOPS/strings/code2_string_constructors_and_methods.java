// Java code to illustrate different constructors and methods 
// String class.

import java.io.*;
import java.util.*;
class Test
{
	public static void main (String[] args)
	{
		String s= "GeeksforGeeks";
		// or String s= new String ("GeeksforGeeks");

		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());

		// Returns the character at ith index.
		System.out.println("Character at 3rd position = "
						+ s.charAt(3));

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring = " + s.substring(2,5));

		// Concatenates string2 to the end of string1.
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string = " +
							s1.concat(s2));

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + 
						s4.indexOf("Share"));

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a = " + 
						s4.indexOf('a',3));

		// Checking equality of Strings
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality " + out);

		out = "Geeks".equalsIgnoreCase("gEeks ");
		System.out.println("Checking Equality" + out);

		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2" + out);

		// Converting cases
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " +
							word1.toLowerCase());

		// Converting cases
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + 
							word1.toUpperCase());

		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());

		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f' ,'g') ;
		System.out.println("Replaced f with g -> " + str2);
	} 
}
