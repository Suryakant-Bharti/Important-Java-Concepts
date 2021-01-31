public class Solution {
    public int maxProfit(int[] prices) {
        
        int curMax = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length ; i++)
        {
            curMax = Math.max(0 , curMax + prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxSoFar, curMax);
        }
        return maxSoFar;
    }
}
