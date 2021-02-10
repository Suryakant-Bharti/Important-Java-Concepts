class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            leftSum += nums[i];
            if(leftSum - nums[i] == totalSum - leftSum)
                return i;
        }
        
        return -1;
    }
}
