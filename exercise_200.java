public class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        // iterate each entry and decide whether it is an island
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    //set surrounding entries from 0 to 1
                    searchIsIslands(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    
    public void searchIsIslands(char[][] grid, int x, int y){
        grid[x][y] = '0';
        //set current entry to 0, so it won't be reenter in the future
        if(x > 0 && grid[x-1][y] == '1'){
            searchIsIslands(grid, x-1, y);
        }//up
    
        if(y > 0 && grid[x][y-1] == '1'){
            searchIsIslands(grid, x, y-1);
        }//left
        
        if(x < grid.length-1 && grid[x+1][y] == '1'){
            searchIsIslands(grid, x+1, y);
        }//down
        
        if(y < grid[0].length-1 && grid[x][y+1] == '1'){
            searchIsIslands(grid, x, y+1);
        }//right
        
    }
}
