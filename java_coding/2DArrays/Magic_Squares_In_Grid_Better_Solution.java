class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        int count = 0; 
        for (int i = 1; i < grid.length - 1; i++) 
            for (int j = 1; j < grid[0].length - 1; j++) 
                if (grid[i][j] == 5) 
                {
                    String s = "" + grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i][j+1]
                        + grid[i+1][j+1] + grid[i+1][j] + grid[i+1][j-1] + grid[i][j-1];
                    
                    if (s.matches("43816729|81672943|67294381|29438167|49276183|27618349|61834927|83492761")) count++;
                }
        return count;
    }
}
