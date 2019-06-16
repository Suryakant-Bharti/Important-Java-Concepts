public class ArrayDuplicate {
    public static void main(String args[])
     
    {
            int array[] = { 10, 20, 30, 20, 40, 40, 50, 60, 70, 80 };// array of ten    
            // elements
            int size = array.length;
            System.out.println("Size before deletion: " + size);
 
            for (int i = 0; i < size; i++) 
            {
 
                for (int j = i + 1; j < size; j++) 
                {
                    if (array[i] == array[j]) // checking one element with all the element
                    {
                        while (j < (size) - 1) 
                        {
                            array[j] = array[j + 1];// shifting the values
                            j++;
                        }   
                        size--;
                    }
                }
            }
            System.out.println("Size After deletion: " + size);
 
            for (int k = 0; k < size; k++) 
            {
                System.out.println(array[k]); // printing the values
            }
    }
}