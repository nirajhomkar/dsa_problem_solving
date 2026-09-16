class Solution {
    public int trap(int[] height) {
        int left_max=Integer.MIN_VALUE;
		
		int store=0;
		for(int i=0;i<height.length-1;i++)
		{
			left_max=Math.max(left_max, height[i]);
			int right_max=Integer.MIN_VALUE;
			for(int j=i+1;j<height.length;j++)
			{
				
				
				right_max=Math.max(right_max, height[j]);
				
				
			}
            store+=Math.max(0,Math.min(left_max, right_max) - height[i]);
		}
		return store;
    }
}