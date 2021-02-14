class Solution {
    public int thirdMax(int[] nums) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        
        for(int num: nums)
            if(!pq.contains(num))
            {
                pq.offer(num);
                if(pq.size()>3)     pq.poll();
            }

        if(pq.size()==2)    pq.poll();

        return pq.peek();
    }
}
