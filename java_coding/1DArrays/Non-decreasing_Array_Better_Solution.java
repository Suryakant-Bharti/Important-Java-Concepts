class Solution {
    public boolean checkPossibility(int[] nums) {
        
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                if(i == 0)
                    nums[i] = Integer.MIN_VALUE;
                else if(i == nums.length-2)
                    nums[i+1] = Integer.MAX_VALUE;
                else
                {
                    if(nums[i] < nums[i+2])
                        nums[i+1] = (nums[i] + nums[i+2])/2;
                    else
                        nums[i] = (nums[i-1] + nums[i+1])/2;
                }
                    
                break;
            }
        }
        
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }
        
        return true;
    }
}
