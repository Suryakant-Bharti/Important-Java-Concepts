class Solution {
    public int[] sortedSquares(int[] A) {
        
        int[] result = new int[A.length];
        int resultIndex = 0, moveRight = 0, nonNegIndex = -1;;
        
        if(A.length == 1) return new int[]{(A[0]*A[0])};
        
        for(int i = 0; i < A.length; i++)
            if(A[i] >= 0)
            {
                nonNegIndex = i;
                break;
            }
        
        int leftGoingIndex = nonNegIndex-1;
        int rightGoingIndex = nonNegIndex;
        while((leftGoingIndex >= 0) || (rightGoingIndex <= A.length-1))
        {
            if(leftGoingIndex < 0) moveRight = 1;
            else if(rightGoingIndex > A.length-1) moveRight = -1;
            else if(Math.abs(A[leftGoingIndex]) > Math.abs(A[rightGoingIndex])) moveRight = 1;
            else moveRight = -1;

            if(moveRight == 1)
            {
                result[resultIndex] = A[rightGoingIndex] * A[rightGoingIndex];
                rightGoingIndex++;
            }
            else
            {
                result[resultIndex] = A[leftGoingIndex] * A[leftGoingIndex];
                leftGoingIndex--;
            }
            
            resultIndex++;
        }
        
        return result;
    }
}
