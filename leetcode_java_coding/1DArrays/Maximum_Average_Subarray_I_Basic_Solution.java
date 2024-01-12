class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double maxAvg = -10001;
        for(int i = 0; i <= nums.length-k; i++)
        {
            double tempSum = 0, tempAvg = 0;
            
            for(int j = i; j < i+k; j++)
                tempSum += nums[j];
            
            tempAvg = tempSum/k;
            
            if(maxAvg < tempAvg)
                    maxAvg = tempAvg;
        }
        return maxAvg;
    }
}
