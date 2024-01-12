class Solution {
    public int heightChecker(int[] heights) {
        
        int[] correctPos = heights.clone();
        Arrays.sort(correctPos);
        
        int wrongPosCount = 0;
        
        for(int i = 0; i < heights.length; i++)
            if(heights[i] != correctPos[i])
                wrongPosCount++;
        
        return wrongPosCount;
    }
}
