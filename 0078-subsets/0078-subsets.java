class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current=new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int index=0;
		
		backtrack(nums,current,result,index);
		
		return result;
    }
    public void backtrack(int[] nums,List<Integer> current,List<List<Integer>> result, int index)
	{
		
		if(index == nums.length)
		{
			result.add(new ArrayList<Integer>(current));
			return;
		}
		current.add(nums[index]);
		backtrack(nums,current,result,index + 1);
		current.remove(current.size()-1);
		
		//for remove skip
		backtrack(nums,current,result,index + 1);
		
	}
}