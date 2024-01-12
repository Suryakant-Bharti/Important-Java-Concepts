class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i = 0; i < nums.length; i++)
        {
            int indexToUpdate = nums[i];
            if(indexToUpdate < 0)
                indexToUpdate = -indexToUpdate;
            indexToUpdate--;
            
            if(nums[indexToUpdate] > 0)
                nums[indexToUpdate] = -nums[indexToUpdate];
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
                result.add(i+1);
        }
        
        return result;
    }
}
