class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int[] length_mod = new int [60];
        int count = 0;
    
        
        for(int i = 0; i < time.length; i++)
        {
            
            length_mod[time[i] % 60]++;
        }
        
        int zeroCount = 0;
        for(int i = 0; i < length_mod[0]; i++)
        {
            zeroCount += i;
        }
        count += zeroCount;
        
        int thirtyCount = 0;
        for(int i = 0; i < length_mod[30]; i++)
        {
            thirtyCount += i;
        }
        count += thirtyCount;
    
        
        for(int i = 1; i < 30; i++)
        {
            count += length_mod[i] * length_mod[60-i];
        }
        
        return count;
    }
}
