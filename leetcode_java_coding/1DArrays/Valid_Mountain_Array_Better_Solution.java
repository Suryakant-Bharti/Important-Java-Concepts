class Solution {
    public boolean validMountainArray(int[] A) {
        
        int len = A.length;
        if(len < 3) return false;
        
        int index = 0, peakIndex = -1;
        while(index < len-1)
        {
            if(A[index] == A[index+1])          return false;
            else if(A[index] > A[index+1])      break;
            index++;
        }
        
        if(index == 0 || index == len-1)        return false;
        
        while(index < len-1)
        {
            if(A[index] <= A[index+1])          return false;
            index++;
        }
        
        return true;  
    }
}
