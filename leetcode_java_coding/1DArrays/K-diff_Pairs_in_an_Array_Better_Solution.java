class Solution {
    public int findPairs(int[] nums, int k) {
        
        if (k < 0) { return 0; }

        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (uniqueSet.contains(nums[i] - k)) resultSet.add(nums[i] - k);
            if (uniqueSet.contains(nums[i] + k)) resultSet.add(nums[i]);
            uniqueSet.add(nums[i]);
        }

        return resultSet.size();
    }
}
