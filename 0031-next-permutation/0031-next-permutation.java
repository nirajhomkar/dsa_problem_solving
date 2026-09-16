class Solution {
    public void nextPermutation(int[] nums) {
        int i;
		for(i=nums.length-2;i>=0;i--)
		{
			if(nums[i]<nums[i+1])
			{
				break;
			}
			
		}
		//Now the for loop is finished
		if(i==-1)
		{
			//reverse entire array
			reverse(0,nums.length-1,nums);
		}
		else
		{
			//Find slightly larger element
			for(int j=nums.length-1;j>i;j--)
			{
				if(nums[j]>nums[i])
				{
					//swap
					int temp=nums[j];
					nums[j]=nums[i];
					nums[i]= temp;
					break;
				}
			}
			//Reverse from i+1 to end
			reverse(i+1,nums.length-1,nums);
		}
    }
    public static void reverse(int left,int right,int []nums)
	{
		while(left<right)
		{
			int temp1=nums[left];
			nums[left]=nums[right];
			nums[right]=temp1;
			left++;
			right--;
		}
	}
}