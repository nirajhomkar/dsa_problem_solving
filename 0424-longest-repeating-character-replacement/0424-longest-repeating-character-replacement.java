class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFrequency=0;
        int maxLength=0;
        int []frequency=new int[26];
        for(int right=0;right<s.length();right++)
        {
            //update the frequency table
            frequency[s.charAt(right) - 'A']++;
            //get the max element
            maxFrequency=Math.max(frequency[s.charAt(right)-'A'],maxFrequency);

            //windowSize
            int windowSize=right-left+1;
            if(windowSize - maxFrequency <=k)
            {
                maxLength=Math.max(maxLength,windowSize);
            }
            else
            {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }

        }
        return maxLength;
    }
}