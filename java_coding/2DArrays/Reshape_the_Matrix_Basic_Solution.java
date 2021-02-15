class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        if((nums.length*nums[0].length) != (r*c))    return nums;
           
        int[][] reshapedMatrix = new int[r][c];
        
        int rowIndex = 0, columnIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                reshapedMatrix[rowIndex][columnIndex] = nums[i][j];
                
                if(columnIndex < c-1)
                    columnIndex++;
                else 
                {
                    rowIndex++; 
                    columnIndex = 0;
                }
            }
        }
        
        return reshapedMatrix;
    }
}
