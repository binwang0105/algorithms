public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        
        //数组的横纵向长度
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(m == 0) 
            return 0;
        
        //用于记录目前最大的path
        int maxSum = 0;
        
        int[][] pathSum = new int[m][n];
        
        //init to 1
        for(int a = 0; a < m; a++)
            for(int b = 0; b < n; b++)
                    pathSum[a][b] = 1;
        
        //update每一个pathSum，求出最大数值
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(pathSum[i][j] == 1)
                    maxSum = Math.max(maxSum, dfs(matrix, pathSum, m, n, i, j));
        
        return maxSum;
    }
    
     private int dfs(int[][] matrix, int[][] pathSum, int m, int n, int i, int j){
        
        if(pathSum[i][j] != 1)   
            return pathSum[i][j];
        
        int res = 1;
        
        //up, left, down, right
        if(i - 1 >= 0 && matrix[i][j] < matrix[i - 1][j])
            res = Math.max(res, 1 + dfs(matrix, pathSum, m, n, i - 1, j));
        if(j - 1 >= 0 && matrix[i][j] < matrix[i][j - 1])  
            res = Math.max(res, 1 + dfs(matrix, pathSum, m, n, i, j - 1));
        if(i + 1 < m && matrix[i][j] < matrix[i + 1][j]) 
            res = Math.max(res, 1 + dfs(matrix, pathSum, m, n, i + 1, j));
        if(j + 1 < n && matrix[i][j] < matrix[i][j + 1])
            res = Math.max(res, 1 + dfs(matrix, pathSum, m, n, i, j + 1));
        
        pathSum[i][j] = res;
        
        return res;
    }
}