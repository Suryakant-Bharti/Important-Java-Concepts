// Java program to demonstrate that we can do
// binary search on array elements in a single line
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		
		// Sort the complete array in ascending order
		// so that Binary Search can be applied
		Arrays.sort(ar);

		// To search for a particular value(for eg 9)
		// use binarysearch method of arrays
		int index = Arrays.binarySearch(ar,9);
		System.out.println("Position of 9 in sorted"+
						" arrays is => \n" + index);

	}
}
