class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            int sum = 0;
            for(int j = i; j < nums.length; j++)
            {
                sum = sum + nums[j];
                if(sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }
}
