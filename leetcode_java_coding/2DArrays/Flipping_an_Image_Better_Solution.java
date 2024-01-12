class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int R = A.length, C = A[0].length;
        
        for(int i = 0; i < R; i++)
            for(int j = 0; j < C/2; j++)
                A[i][j] = A[i][j] ^ A[i][C-1-j] ^ (A[i][C-1-j] = A[i][j]);
        
        for(int i = 0; i < R*C; i++)
            A[i/R][i%C] = Math.abs(A[i/R][i%C]-1);
        
        return A;
    }
}
