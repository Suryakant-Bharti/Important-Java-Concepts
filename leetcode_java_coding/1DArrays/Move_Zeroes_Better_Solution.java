class Solution {
    public void moveZeroes(int[] nums) {
        
        int arrayLen = nums.length;
        int zeroCount = 0;
        for(int i = 0; i < arrayLen; i++)
        {
            if(nums[i] == 0)
            {
                zeroCount++;
            }
            else
            {
                nums[i-zeroCount] = nums[i];
            }
        }
        
        for(int i = arrayLen-zeroCount; i < arrayLen; i++)
        {
            nums[i] = 0;
        }
    
    }
}
