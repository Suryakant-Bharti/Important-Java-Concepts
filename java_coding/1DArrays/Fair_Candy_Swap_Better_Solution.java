class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sumA = 0, sumB = 0;
        for(int val: A)     sumA += val;
        for(int val: B)     sumB += val;

        int delta = (sumB - sumA) / 2;
              
        Set<Integer> setB = new HashSet<>();
        for(int val: B)     setB.add(val);
        
        for(int val: A)
            if(setB.contains(val + delta))
                return new int[]{val, val + delta};
        
        return null;
    }
}
