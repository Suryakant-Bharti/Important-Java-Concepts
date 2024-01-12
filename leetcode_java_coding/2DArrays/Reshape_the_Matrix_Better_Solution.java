class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int origR = nums.length, origC = nums[0].length;
        
        if(origR*origC != r*c) return nums;

        int[][] reshapedMatrix = new int[r][c];
        
        for(int i = 0; i < r*c; i++)
            reshapedMatrix[i/c][i%c] = nums[i/origC][i%origC];

        return reshapedMatrix;
    }
}
