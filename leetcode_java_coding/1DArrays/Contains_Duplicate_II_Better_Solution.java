class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> indexMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            if(indexMap.containsKey(num))
                if(i - indexMap.get(num) <= k)
                    return true;
            
            indexMap.put(num, i);
        }
        return false;
        
    }
}
