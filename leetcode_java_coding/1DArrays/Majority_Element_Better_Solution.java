class Solution {
    public int majorityElement(int[] nums) {
        
        int numWithMaxFreq = -1;
        int numWithMaxFreqCount = 0;

        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: count.entrySet())
        {
            if(entry.getValue() > numWithMaxFreqCount)
            {
                numWithMaxFreqCount =  entry.getValue();
                numWithMaxFreq = entry.getKey();
            }
        }
        
        return numWithMaxFreq;    
    }
}
