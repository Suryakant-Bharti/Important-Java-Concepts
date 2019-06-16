// Java program to demonstrate that we can copy
// an array or a subarray to a new array in single
// line.
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// Copy the whole array
		int[] copy = Arrays.copyOf(ar, ar.length);
		System.out.println("Copied array => \n" + 
						Arrays.toString(copy));

		// Copy a specified range into a new array.
		int[] rcopy = Arrays.copyOfRange(ar, 1, 5);
		System.out.println("Copied subarray => \n" + 
						Arrays.toString(rcopy));
	}
}
