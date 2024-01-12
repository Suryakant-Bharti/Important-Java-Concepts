class Solution {
    public void duplicateZeros(int[] arr) {
        
        int newIndex = 0;
        int[] newArr = arr.clone();
        
        for(int i = 0; newIndex < arr.length; i++)
        {
            newArr[newIndex] = arr[i];
            newIndex++;
            
            if(arr[i] == 0 && newIndex < arr.length)
            {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = newArr[i];
        }
    }
}
