class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] temp = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            if(k+i < nums.length)
                temp[k+i] = nums[i];
            else
                temp[k+i-nums.length] = nums[i];
        }
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = temp[i];
    }
}
