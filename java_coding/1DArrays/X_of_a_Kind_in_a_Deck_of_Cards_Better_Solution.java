class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
            
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int val: deck)
        {
            count.put(val, count.getOrDefault(val, 0) + 1);
        }
        
        int result = 0;
        for(int val: count.values())
        {
            result = gcd(val, result);
        }
        
        return result > 1;
    }
    
    public int gcd(int n1, int n2) {
        
        if (n2 != 0)    return gcd(n2, n1 % n2);
        else            return n1;
    }
}
