class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int[] result = new int[A.length];
        int resultIndex = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            if((A[i] % 2) == 0)
            {
                result[resultIndex] = A[i];
                resultIndex += 2;
            }
        }
        
        resultIndex = 1;
        for(int i = 0; i < A.length; i++)
        {
            if((A[i] % 2) == 1)
            {
                result[resultIndex] = A[i];
                resultIndex += 2;
            }
        }
        
        return result;
    }
}
