class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++)
        {
            int curMax = 0;
            for(int j = i+1; j < arr.length; j++)
            {
                curMax = Math.max(curMax, arr[j]);
            }
            arr[i] = curMax;
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
    }
}
