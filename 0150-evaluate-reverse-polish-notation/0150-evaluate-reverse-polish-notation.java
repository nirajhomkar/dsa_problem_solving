class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
		int result = 0;
		for(String s : tokens)
		{
			if(s.equals("+"))
			{
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b + a);
			}
			else if(s.equals("-"))
			{
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b - a);
			}
			else if(s.equals("*"))
			{
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b * a);
			}
			else if(s.equals("/"))
			{
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			}
			else
			{
				int num = Integer.parseInt(s);
				stack.push(num);
			}
			
		}
		return stack.peek();
    }
}