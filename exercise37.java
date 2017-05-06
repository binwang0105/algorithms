public class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int k = j / 3 + (i / 3) * 3;
                    rows[i][num] = cols[j][num] = blocks[k][num] = true;
                }
            }
        }

        dfs(0, board, rows, cols, blocks);
    }

    private boolean dfs(int index, char[][] board, boolean[][] rows, 
                     boolean[][] cols, boolean[][] blocks){
        if(index == 81) return true;
        int row = index / 9;
        int col = index % 9;
        int block = col / 3 + (row / 3) * 3;

        if(board[row][col] != '.') {
            return dfs(index + 1, board, rows, cols, blocks);
        } else {
            for(char chr = '1'; chr <= '9'; chr ++){
                int num = chr - '1';
                if(!rows[row][num] && !cols[col][num] && !blocks[block][num]){
                    board[row][col] = chr;
                    rows[row][num] = true;
                    cols[col][num] = true;
                    blocks[block][num] = true;

                    if(dfs(index + 1, board, rows, cols, blocks)) return true;

                    board[row][col] = '.';
                    rows[row][num] = false;
                    cols[col][num] = false;
                    blocks[block][num] = false;
                }
             }
        }

        return false;
    }
}
