class Solution {
    static final int[] dr = {-1, 1, 0, 0};
	static final int[] dc = {0, 0, -1, 1};
    public boolean exist(char[][] board, String word) {
         boolean[][] visited = new boolean[board.length][board[0].length];
		 for(int row = 0;row < board.length; row++)
		 {
			 for(int col = 0;col < board[0].length; col++)
			 {
				 if(backtrack(board,word,row,col,0,visited))
				 {
					 return true;
				 }
			 }
		 }
	        
	        return false;
    }
    public static boolean backtrack(
	            char[][] board,
	            String word,
	            int row,
	            int col,
	            int index,
	            boolean[][] visited) {
	        
	        // Your code here
		 if(index == word.length())
		 {
			 return true;
		 }
		 if(row >= board.length  || row < 0 || col >=board[0].length || col < 0)
		 {
			 return false;
		 }
		 if(visited[row][col])
		 {
			 return false;
		 }
		 if(board[row][col]!=word.charAt(index))
		 {
			 return false;
		 }
		 
		//take
		 visited[row][col] = true;
		
		 for(int i=0;i<4;i++)
		 {
			 int newRow = row + dr[i];
			 int newCol = col + dc[i];
			 
			 
			 
			 //recurse
			 if(backtrack(board, word, newRow, newCol, index + 1, visited))
			 {
				 return true;
			 }
			 
		 }
		//undo
		 visited[row][col] = false;
	        
	        return false;
	    }
}