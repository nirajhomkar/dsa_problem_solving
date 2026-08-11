class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		int remaining = target;
		backtrack(candidates,0,remaining,current,result);
		
		return result;
    }
    public static void backtrack(
	        int[] candidates,
	        int index,
	        int remaining,
	        List<Integer> current,
	        List<List<Integer>> result) {
		if(remaining == 0)
		{
			result.add(new ArrayList<>(current));
			return;
		}
		for(int i = index;i<candidates.length;i++)
		{
			if(remaining < candidates[i])
			{
				break;
			}
			//add
			current.add(candidates[i]);
			//recurse
			backtrack(candidates,i,remaining - candidates[i],current,result);
			
			current.remove(current.size()-1);
			
		}
	}
}