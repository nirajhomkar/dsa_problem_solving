class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
		for(char c:s.toCharArray())
		{
			if(c=='[')
			{
				stack.push(']');
			}
			else if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='(')
			{
				stack.push(')');
			}
			if(c=='}'||c==']'||c==')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(stack.peek()!=c)
				{
					return false;
				}
				stack.pop();			
			}
		}
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
    }
}