class Solution {
    public int maxArea(int[] height) {
        
        int left =0;
        int right = height.length-1;
        int area = 0;
        while(left<right)
        {
            int shorter = Math.min(height[left],height[right]);
            int width = right - left;
            area = Math.max(area,shorter * width);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return area;
    }
}