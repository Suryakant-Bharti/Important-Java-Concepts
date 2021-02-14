class Solution {
    public int[] sortArrayByParity(int[] A) {
    
        int[] result = new int[A.length];
        int resultIndex = 0;
        
        for(int i = 0; i < A.length; i++)
        {
            if((A[i] % 2) == 0)
            {
                result[resultIndex] = A[i];
                resultIndex++;
            }
        }
        
        for(int i = 0; i < A.length; i++)
        {
            if((A[i] % 2) == 1)
            {
                result[resultIndex] = A[i];
                resultIndex++;
            }
        }
        
        return result;
    }
}
