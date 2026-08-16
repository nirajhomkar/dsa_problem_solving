class Solution {
    static String[] phone = {
		    "", "", "abc", "def", "ghi",
		    "jkl", "mno", "pqrs", "tuv", "wxyz"
		};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
	    StringBuilder current = new StringBuilder();

	    if(digits.length() == 0)
	    {
	        return result;
	    }

	    backtrack(digits, 0, current, result);

	    return result;
    }
    public static void backtrack(
	        String digits,
	        int index,
	        StringBuilder current,
	        List<String> result)
	{
	    // Base case
		if(index == digits.length())
		{
			result.add(current.toString());
			return;
		}
		
		char letters = digits.charAt(index);

		String letters1 = phone[Character.getNumericValue(digits.charAt(index))];
	    // Get letters for current digit
	
	    // Loop through letters

	    for(int i=0;i<letters1.length();i++)
	    {
	        // Choose
	    	current.append(letters1.charAt(i));
	    	

	        // Recurse
	    	backtrack(digits, index + 1, current, result);

	        // Undo
	    	current.deleteCharAt(current.length()-1);
	    }
	}
}