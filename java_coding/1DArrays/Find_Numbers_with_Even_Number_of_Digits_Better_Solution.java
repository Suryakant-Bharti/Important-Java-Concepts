class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            int temp = nums[i];
            int digits = 0;
            
            while(temp > 0)
            {
                temp /= 10;
                digits++;
            }
            
            if(digits % 2 == 0)
            {
                count++;
            }
        }
        
        return count;
    }
}
