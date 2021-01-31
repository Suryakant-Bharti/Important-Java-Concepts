class Solution {
    public int maxProfit(int[] prices) {
        
        int maxSoFar = 0;
        for(int i = 1; i < prices.length ; i++)
        {
            if(prices[i] > prices[i-1])
            {
                maxSoFar += prices[i] - prices[i-1];
            }
        }
        
        return maxSoFar;
    }
}
