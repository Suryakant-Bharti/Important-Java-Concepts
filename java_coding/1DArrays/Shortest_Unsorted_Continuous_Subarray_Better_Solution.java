class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int[] sortednums = nums.clone();
        Arrays.sort(sortednums);
            
        int start = sortednums.length;
        int end = 0;
        
        for (int i = 0; i < sortednums.length; i++)
        {
            if(sortednums[i] != nums[i])
            {
                start = Math.min(start, i);
                break;
            }
        }
        
        for (int i = sortednums.length-1; i >= 0; i--)
        {
            if(sortednums[i] != nums[i])
            {
                end = Math.max(end, i);
                break;
            }
        }
    
        if(end - start >= 0)
            return ((end - start) + 1);
        else
            return 0;
    }
}
