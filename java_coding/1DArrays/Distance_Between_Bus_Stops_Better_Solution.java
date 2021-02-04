class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int ptr1 = Math.min(start, destination);
        int ptr2 = Math.max(start, destination);
        
        int clockDist = 0, anticlockDist = 0;
        while(ptr1 != Math.max(start, destination))
        {
            clockDist += distance[ptr1];
            ptr1++;
        }
        
        while(ptr2 != Math.min(start, destination))
        {
            anticlockDist += distance[ptr2];
            ptr2++;
            
            if(ptr2 == distance.length) ptr2 = 0;
        }
        
        return Math.min(clockDist, anticlockDist);
    }
}
