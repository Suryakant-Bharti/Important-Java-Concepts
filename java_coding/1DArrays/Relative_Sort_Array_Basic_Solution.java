class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int resultIndex = 0, found = 0;
        int[] result = new int[arr1.length];
        
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr1.length; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    result[resultIndex] = arr1[j];
                    resultIndex++;
                }
            }
        }
        
        int tempToSortIndex = resultIndex;
        for(int i = 0; i < arr1.length; i++)
        {
            int j = 0;
            for(; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    found = 1;
                    break;
                }
            }
            
            if(found == 0)
            {
                result[resultIndex] = arr1[i];
                resultIndex++;
            }
            
            found = 0;
        }
        
        Arrays.sort(result, tempToSortIndex, result.length);
        
        return result;
    }
}
