public class Solution {
    int total;
    
    public int totalNQueens(int n) {
        if(n == 0 || n == 2 || n == 3)
            return 0;
        
        boolean[] ocp90 = new boolean[n];
        boolean[] ocp45 = new boolean[2*n - 1];
        boolean[] ocp135 = new boolean[2*n - 1];
        
        char[][] map = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = '.';
            }
        }
        
        dfs(0, n, map, ocp90, ocp45, ocp135);
        return total;
    }
    
    private void dfs(int depth, int n, char[][] map, boolean[] ocp90, boolean[] ocp45, boolean[] ocp135){
        if(depth == n){
            total++;
            return;
        }
        
        for(int i = 0; i < n; i ++){
            if(!ocp90[i] && !ocp45[i + depth] && !ocp135[i - depth + n - 1]){
                ocp90[i] = true;
                ocp45[i + depth] = true;
                ocp135[i - depth + n - 1] = true;
                map[depth][i] = 'Q';
                
                dfs(depth + 1, n, map, ocp90, ocp45, ocp135);
                
                ocp90[i] = false;
                ocp45[i + depth] = false;
                ocp135[i - depth + n - 1] = false;
                map[depth][i] = '.';
            }
        }
    }
}