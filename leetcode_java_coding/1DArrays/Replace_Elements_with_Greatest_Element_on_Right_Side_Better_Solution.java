class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] maxTillNowArr = new int[arr.length];
        
        int curMax = -1;
        for(int i = arr.length-1; i >= 0; i--)
        {
            curMax = Math.max(curMax, arr[i]);
            maxTillNowArr[i] = curMax;
        }
        
        for(int i = 0; i < arr.length-1; i++)
        {
            arr[i] = maxTillNowArr[i+1];
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
    }
}
