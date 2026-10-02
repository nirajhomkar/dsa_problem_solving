class Solution {
    public String longestPalindrome(String s) {
       
        int start=0;
        int maxLength=0;

        for(int i=0;i< s.length(); i++)
        {
            int odd = expand(s,i,i);

            int even = expand(s,i,i+1);

            int oddLength = 2 * odd - 1;

            int evenLength = 2*even;

            if(oddLength > maxLength)
            {
                maxLength=oddLength;
                start = i - oddLength/2;
            } 

            if(evenLength > maxLength)
            {
                maxLength = evenLength;
                start = i- evenLength/2 + 1;
            }
        }
        return s.substring(start,start+maxLength);
    }
    private int expand(String s,int left,int right)
    {
        int count=0;
        while(left >= 0 && right <s.length() && s.charAt(left)==s.charAt(right))
        {
            count++;
            left--;
            right++;
        }

        return count;
    }
}