class Solution {
    public int minCostToMoveChips(int[] chips) {
        
        int oddNums = 0, evenNums = 0;
        
        for(int i = 0; i < chips.length; i++)
        {
            if(chips[i]%2 == 0)     evenNums++;
            else                    oddNums++;
        }
        
        return Math.min(evenNums, oddNums);
    }
}
