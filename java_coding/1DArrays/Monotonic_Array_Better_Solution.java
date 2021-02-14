class Solution {
    public boolean isMonotonic(int[] A) {
        
        boolean monotone = false;
            
        int i = 0;
        for(; i < A.length-1; i++)
            if(A[i] > A[i+1])
                break;
        
        int j = 0;
        for(; j < A.length-1; j++)
            if(A[j] < A[j+1])
                break;
        
        if((i == A.length-1) || (j == A.length-1))
            monotone = true;
           
        return monotone;
    }
}
