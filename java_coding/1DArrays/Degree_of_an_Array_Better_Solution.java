class Solution {
    public int findShortestSubArray(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<>(), firstIndex = new HashMap<>();;
        
        int degree = 0, result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            firstIndex.putIfAbsent(nums[i], i);
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            
            int val = countMap.get(nums[i]);
            if(val > degree)
            {
                degree = val;
                result = i - firstIndex.get(nums[i]) + 1;
            }
            else if(val == degree)
            {
                degree = val;
                result = Math.min(result, i - firstIndex.get(nums[i]) + 1);
            }
        }
        
        return result;
    }
}
