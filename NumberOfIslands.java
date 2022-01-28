class Solution {
    public int numIslands(char[][] grid) {
      if(grid == null || grid.length == 0){
          return 0;
      }  
    int nr = grid.length;
    int nc = grid[0].length;
    int numIslands = 0;
    for(int r = 0; r < nr; r++){
        for(int c = 0; c < nc; c++){
            if(grid[r][c] == '1'){
                numIslands++;
                dfs(grid,r,c);
            }
        }
    }
        return numIslands;
    }
    void dfs(char[][]grid,int r,int c){
       
        int nr = grid.length;
        int nc = grid[0].length;
        if(r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);      
    }
}
/*
we use a DFS model
we use a double for loop to iterate through the entire grid.
with each dfs method call, we check the 4 sides and make sure they are within bounds and not == '0'
if it is still a part of the island we convert it into a '0' to make sure the dfs does not think it is a new 
island AND the double for loop does not think it is a new island.
