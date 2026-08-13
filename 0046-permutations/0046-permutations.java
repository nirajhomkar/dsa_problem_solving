class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
	    List<Integer> current = new ArrayList<>();
	    boolean[] used = new boolean[nums.length];

	    backtrack(nums, used, current, result);

	    return result;
    }
    public static void backtrack(
	        int[] nums,
	        boolean[] used,
	        List<Integer> current,
	        List<List<Integer>> result)
	{
	    // Base case
		if(current.size()==nums.length)
		{
			result.add(new ArrayList<Integer>(current));
			return;
		}
		

	    for(int i = 0; i < nums.length; i++)
	    {
	        // Already used?
	    	if(used[i])
	    	{
	    		continue;
	    	}

	        // Choose
	    	current.add(nums[i]);
	    	used[i]=true;
	        // Recurse
	    	backtrack(nums, used, current, result);

	        // Undo
	    	used[i]=false;
	    	current.remove(current.size()-1);

	    }
    }
}
