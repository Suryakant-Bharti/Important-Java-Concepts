class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int longestSubArray = 0;
        int tempLongSubArray = 0;
        int i = 0;
        for(; i < nums.length-1; i++)
        {
            tempLongSubArray++;
            
            longestSubArray = Math.max(longestSubArray, tempLongSubArray);
            
            if(nums[i] >= nums[i+1])
                tempLongSubArray = 0;
        }
        
        if(nums.length == 0) return 0;
        else if(nums.length == 1) return 1;
        
        if(longestSubArray == tempLongSubArray)
                    longestSubArray++;
        
        return longestSubArray;
    }
}
