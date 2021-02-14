class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int expectedSum = (int)(((float)n/2)*(n+1));
        int calculatedSum = 0;
        
        for(int num: nums)
            calculatedSum += num;
        
        return expectedSum - calculatedSum;
    }
}
