class Solution {
    public int findMin(int[] nums) {
        int num=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(num > nums[i])
            {
                num = nums[i];
                break;
            }
        }
        return num;
    }
}