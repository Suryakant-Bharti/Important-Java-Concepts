class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        for(int i = 0; i < len; i++)
        {
            if((flowerbed[i]==0) && (i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0))
            {
                n--;
                flowerbed[i] = 1;
            }
        }
        
        if(n <= 0)  return true;
        else        return false;
    }
}
