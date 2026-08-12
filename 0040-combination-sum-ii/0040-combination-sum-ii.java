class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

	    // result
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
	    // current
		List<Integer> current = new ArrayList<Integer>();
		
	    // backtrack
		backtrack(candidates,0,target,current,result);
	    // return result
		return result;
    }
    public static void backtrack(
	        int[] candidates,
	        int index,
	        int remaining,
	        List<Integer> current,
	        List<List<Integer>> result) {

	    // base case
		if(remaining == 0)
		{
			result.add(new ArrayList<Integer>(current));
			return;
		}
	    for (int i = index; i < candidates.length; i++) {

	        // candidate too large?
	    	if(candidates[i] > remaining)
	    	{
	    		break;
	    	}
	        // duplicate check
	    	if(i>index && candidates[i-1] == candidates[i])
	    	{
	    		continue;
	    	}
	        // choose
	    	current.add(candidates[i]);
	        // recurse
	    	backtrack(candidates,i+1,remaining - candidates[i],current ,result);
	    	
	        // undo
	    	current.remove(current.size()-1);
	    }
	}
}