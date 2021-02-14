class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int len = arr.length;
        if(len == 0)    return new int[0];
        
        int[] sortedArr = arr.clone();
        
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] rankList = new int[len];
        int rank = 1;
        map.put(sortedArr[0], rank);
    
        for(int i = 1 ; i < len; i++)
            if(sortedArr[i] != sortedArr[i-1])
            {
                rank++;
                map.put(sortedArr[i], rank);
            }

        for(int i = 0 ; i < len; i++)
            rankList[i] = map.get(arr[i]);

        return rankList;
    }
}
