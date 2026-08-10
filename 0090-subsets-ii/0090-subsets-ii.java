class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>(); 
		
		backtrack(nums,0,result,current);
		
		return result;
    }
    public void backtrack(int []nums,int index,List<List<Integer>> result,List<Integer> current)
	{
		result.add(new ArrayList<>(current));
		for(int i = index;i < nums.length; i++)
		{
			if(i>index && nums[i]==nums[i-1])
			{
				continue;
			}
			
			current.add(nums[i]);
			
			// It is condition i get the point whole idea behind it
			backtrack(nums, i + 1, result, current);
			current.remove(current.size()-1);
			
			
		}
    }
}