class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        
        List<Boolean> boolList = new ArrayList<>();
        
        long curVal = 0;
        for(int i = 0; i < A.length; i++)
        {        
            curVal = ((curVal * 2) + A[i]) % 5;
            
            if(curVal == 0)     boolList.add(true);
            else                boolList.add(false);
        }
        
        return boolList;
    }
}
