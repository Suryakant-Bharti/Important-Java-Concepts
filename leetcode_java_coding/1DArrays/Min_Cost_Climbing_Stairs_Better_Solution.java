class Solution {
    public int minCostClimbingStairs(int[] cost) {
    
        int step1 = 0, step2 = 0;
        for(int i = 0; i < cost.length; i++)
        {
            int temp = step2;
            step2 = cost[i] + Math.min(step1, step2);
            step1 = temp;
        }
            
        return Math.min(step1, step2);
    }
}
