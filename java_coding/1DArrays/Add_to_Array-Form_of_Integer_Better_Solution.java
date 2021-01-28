class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        List<Integer> result = new ArrayList<>();
        List<Integer> kArray = new ArrayList<>();
        
        while(K > 0)
        {
            kArray.add(K % 10);
            K /= 10;
        }
        
        Collections.reverse(kArray);

        int tempSum, valA, curSum, carry = 0;
        int maxIndex = Math.max(A.length-1, kArray.size()-1);
            
        for(int i = maxIndex; i >= 0; i--)
        {
            if((A.length-1)-(maxIndex-i) >= 0)   valA = A[(A.length-1)-(maxIndex-i)];
            else               valA = 0;
            
            if((kArray.size()-1)-(maxIndex-i) >= 0)  
                valA += kArray.get((kArray.size()-1)-(maxIndex-i));
            
            curSum = carry + valA;
            result.add(curSum % 10);
            carry = 0;
                
            if(curSum > 9)     carry = curSum / 10;
        }
        
        if(carry > 0)  result.add(carry);
        
        Collections.reverse(result);
        return result;
    }
}
