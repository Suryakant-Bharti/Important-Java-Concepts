class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        int last = nums.length-1;
        int negProd = 1, posProd = 1;
        
        negProd = nums[0] * nums[1] * nums[last];
        posProd = nums[last] * nums[last-1] * nums[last-2];
        
        return Math.max(negProd, posProd);
    }
}
