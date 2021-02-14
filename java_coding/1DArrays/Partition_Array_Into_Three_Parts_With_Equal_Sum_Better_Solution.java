class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        
        long totalSum = 0;
        for(int i = 0; i < A.length; i++)
        {
            totalSum += A[i];
        }
        
        long sumByThree = totalSum/3;
        long curSum = 0;
        for(int i = 0; i < A.length; i++)
        {
            curSum += A[i];
            if(curSum == sumByThree)    curSum = 0;
        }
        
        if(curSum == 0)     return true;
        else                return false;
    }
}
