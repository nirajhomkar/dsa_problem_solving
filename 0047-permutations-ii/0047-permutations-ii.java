class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
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
	    // Create set for this recursion level
		Set <Integer> usedAtThisLevel = new HashSet<>();
	    // Loop through all elements
		for(int i=0; i<nums.length;i++)
		{
			 // Check if element is already used
			if(used[i])
			{
				continue;
			}
			 // Check duplicate at this level
			if(usedAtThisLevel.contains(nums[i]))
			{
				continue;
			}
			usedAtThisLevel.add(nums[i]);
		   
			
		    // Choose
			used[i] = true;
			current.add(nums[i]);
		    // Recurse
			backtrack(nums, used, current, result);
		    // Undo
			used[i] = false;
			current.remove(current.size() - 1);
		}
    }
}