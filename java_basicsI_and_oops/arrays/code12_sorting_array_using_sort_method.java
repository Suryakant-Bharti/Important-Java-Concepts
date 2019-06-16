// Java program to demonstrate that we can sort
// array elements in a single line
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// To sort a specific range of array in 
		// ascending order.
		Arrays.sort(ar, 0, 4);
		System.out.println("Sorted array in range" + 
			" of 0-4 =>\n" + Arrays.toString(ar));

		// To sort the complete array in ascending order.
		Arrays.sort(ar);
		System.out.println("Completely sorted order =>\n"
								+ Arrays.toString(ar));
	}
}
