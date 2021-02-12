class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = -1, secMax = -1, maxIndex = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if((nums[i] > secMax) && (i != maxIndex))
            {
                secMax = nums[i];
            }
        }
        
        if(max >= secMax*2)     return maxIndex;
        else                    return -1;
    }
}
