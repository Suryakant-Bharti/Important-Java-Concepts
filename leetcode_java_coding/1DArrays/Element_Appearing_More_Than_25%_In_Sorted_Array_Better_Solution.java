class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int target = arr[0];
        int count = 1;
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                count++;
                if(count > arr.length/4)
                {
                    return target;
                }
            }
            else
            {
                target = arr[i];
                count = 1;
            }
        }
        
        return target;
    }
}
