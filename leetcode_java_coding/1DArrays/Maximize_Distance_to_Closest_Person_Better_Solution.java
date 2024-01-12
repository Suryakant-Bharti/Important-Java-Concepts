class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int curMaxZeros = 0, maxZeros = 0, initMaxZeros = 0, result = 0;;
        
        for(int i = 0; i < seats.length; i++)
            if(seats[i] != 0)
            {
                initMaxZeros = i;
                break;
            }
        
        for(int i = 0; i < seats.length; i++)
        {
            if(seats[i] == 0)   curMaxZeros++;
            else                curMaxZeros = 0;
            
            maxZeros = Math.max(maxZeros, curMaxZeros);
        }
        
        result = (maxZeros+1)/2;
        
        if((curMaxZeros > result) || (initMaxZeros > result))
            result = Math.max(curMaxZeros, initMaxZeros);
 
        return result;
    }
}
