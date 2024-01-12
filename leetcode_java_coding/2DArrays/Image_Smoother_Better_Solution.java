class Solution {
    public int[][] imageSmoother(int[][] M) {
        
        int R = M.length, C = M[0].length;
        int[][] result = new int[R][C];
        
        for (int r = 0; r < R; r++)
        {
            for (int c = 0; c < C; c++) 
            {
                int count = 0;
                
                for (int nr = r-1; nr <= r+1; nr++)
                    for (int nc = c-1; nc <= c+1; nc++) 
                        if (0 <= nr && nr < R && 0 <= nc && nc < C) 
                        {
                            result[r][c] += M[nr][nc];
                            count++;
                        }
                
                result[r][c] /= count;
            }
        }
        
        return result;
    }
}
