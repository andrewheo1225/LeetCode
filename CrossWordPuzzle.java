class Solution {
   public boolean search(char[][] board,int row,int col,String word,int level)
{
    int l = word.length();
    /*
    if the length of l matches the length of the targt word
    */
    if(level == l)
    {
        return true;
    }
    /*
    makes sure the letters are inside the bounds of the 2D array
    */
    if(row < 0 || col < 0 || row >= board.length || col >= board[0].length)
    {
        return false;
    }
    /*
    if the letter matches, we move on towrds the up,down,east,west
    if the letter matches, we change the value of the letter into a * to make sure we dont go back to it
    as long as one of the 4 possible direction returns true, there is a possibility of a solution
    level->the indexes of the target word starting from 0 -> word.length
    each iteration we must make a temp 2d array and replace it because everytime we iterate 
        through the 2d Array we must have the original letters instead of *
    */
    
    if(board[row][col] == word.charAt(level))
    {
        char temp = board[row][col];
        board[row][col] = '*';

        boolean up = search(board,row-1,col,word,level+1);
        boolean left = search(board,row,col-1,word,level+1);
        boolean down = search(board,row+1,col,word,level+1);
        boolean right = search(board,row,col+1,word,level+1);

        board[row][col] = temp;
        return up || left || down || right;
    }
    else
    {
        return false;
    }
}


public boolean exist(char[][] board, String word) {
    int l = word.length();

    // word ki length will always be less than grid.
    if(l > board.length * board[0].length) {
        return false;
    }
    //check every box of the 2D array
    for(int row = 0; row < board.length; row++)
    {
        for(int col = 0; col < board[0].length;col++)
        {
            if(board[row][col] == word.charAt(0) && search(board,row,col,word,0) == true)
            {
                
                    return true;
                
            }
        }
    }
    return false;
}
}