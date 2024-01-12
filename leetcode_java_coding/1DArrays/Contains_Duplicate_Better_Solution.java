class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> flagMap = new HashMap<>();
        
        for(int num: nums)
        {
            if(flagMap.containsKey(num))
                return true;
            flagMap.put(num, 1);
        }
        return false;
    }
}
