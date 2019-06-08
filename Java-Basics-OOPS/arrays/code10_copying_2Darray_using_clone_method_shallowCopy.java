// Java program to demonstrate cloning of multi-dimensional arrays

// A clone of a multidimensional array (like Object[][]) is a "shallow copy" however, 
// which is to say that it creates only a single new array with each element array 
// a reference to an original element array but subarrays are shared

class Test
{ 
	public static void main(String args[]) 
	{
		int intArray[][] = {{1,2,3},{4,5}};
		
		int cloneArray[][] = intArray.clone();
		
		// will print false
		System.out.println(intArray == cloneArray);
		
		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArray[0] == cloneArray[0]);
		System.out.println(intArray[1] == cloneArray[1]);
		
	}
}