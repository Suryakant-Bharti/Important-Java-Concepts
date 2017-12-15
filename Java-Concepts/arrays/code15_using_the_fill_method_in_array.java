// Java program to fill a subarray or complete
// array with given value.
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// To fill a range with a particular value
		Arrays.fill(ar, 0, 3, 0);
		System.out.println("Array filled with 0 "+
		"from 0 to 3 => \n" + Arrays.toString(ar));

		// To fill complete array with a particular
		// value
		Arrays.fill(ar, 10);
		System.out.println("Array completely filled"+
				" with 10=>\n"+Arrays.toString(ar));
	}
}
