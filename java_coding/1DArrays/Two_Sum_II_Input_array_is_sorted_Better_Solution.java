class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int m = 0, n = numbers.length-1;
        
        while(numbers[m] + numbers[n] != target)
        {
            if(numbers[m] + numbers[n] > target)    n--;
            else                                    m++;
        }
        
        int[] result = {m+1, n+1};
        return result;
    }
}
