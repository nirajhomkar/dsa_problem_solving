class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
		{
			HashSet<Character> set = new HashSet<>();
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j] == '.')
				{
					continue;
				}
				if(set.contains(board[i][j]))
				{
					return false;
				}
				set.add(board[i][j]);
			}
		}
		
		for(int i=0; i<board.length;i++)
		{
			HashSet<Character> set = new HashSet<>();
			for(int j=0;j<board[i].length;j++)
			{
				
				if(board[j][i]=='.')
				{
					continue;
				}
				if(set.contains(board[j][i]))
				{
					return false;
				}
				set.add(board[j][i]);
			}
		}
		
		for(int rowStart=0;rowStart<9;rowStart+=3)
		{
			for(int colStart=0;colStart<9;colStart+=3)
			{
				HashSet<Character> set = new HashSet<>();
				for(int i=rowStart;i<rowStart+3;i++)
				{
					for(int j=colStart;j<colStart+3;j++)
					{
						if(board[i][j]=='.')
						{
							continue;
						}
						if(set.contains(board[i][j]))
						{
							return false;
						}
						set.add(board[i][j]);
					}
				}
			}
		}
		return true;
    }
}