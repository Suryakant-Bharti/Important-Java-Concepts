class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
	    for(int a : arr) {
		    if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) return true;
		    set.add(a);
	    }
	    return false;
        
    }
}
