class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int arrLength = 0;
        for(int i = 0; i < nums.length; i = i+2)
            arrLength += nums[i];
        
        int[] resultArr = new int[arrLength];
        
        int index = 0;
        for(int i = 0; i < nums.length; i = i+2)
            for(int j = 0; j < nums[i]; j++)
            {
                resultArr[index] = nums[i+1];
                index++;
            }
        
        return resultArr;
    }
}
