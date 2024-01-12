class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sumA = 0, sumB = 0, diffAB = 0;
        
        for(int i = 0; i < A.length; i++)
            sumA += A[i];
        
        for(int i = 0; i < B.length; i++)
            sumB += B[i];
        
        diffAB = sumA - sumB;
                          
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B.length; j++)
            {
                if((A[i] - B[j]) == diffAB/2)
                {
                    int[] result = {A[i], B[j]};
                    return result;
                }
            }
        }
        
        return null;
    }
}
