// Java program to demonstrate asList()

// It takes an array and creates a wrapper that implements List, 
// which makes the original array available as a list. 
//Nothing is copied and all, only a single wrapper object is created. 
//Operations on the list wrapper are propagated to the original array.

import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};

		// Creates a wrapper list over ar[]
		List<Integer> l1 = Arrays.asList(ar);

		System.out.println(l1);
	}
}
