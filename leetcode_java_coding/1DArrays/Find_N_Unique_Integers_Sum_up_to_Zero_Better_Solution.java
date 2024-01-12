class Solution {
    public int[] sumZero(int n) {
        
        int[] result = new int[n];
        int mid = n/2;
        
        if(n%2 == 0)
        {
            for(int i = 0; i < mid; i++)
            {
                result[i] = i+1;
            }
            for(int i = mid; i < n; i++)
            {
                result[i] = mid-i-1;
            }
        }
        else
        {
            result[0] = 0;
            for(int i = 1; i <= mid; i++)
            {
                result[i] = i;
            }
            for(int i = mid+1; i < n; i++)
            {
                result[i] = mid-i;
            }
        }
        
        return result;
    }
}
