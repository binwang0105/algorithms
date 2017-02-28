public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int rowA = A.length;
        int colB = B[0].length;
        int rowB = B.length;
        int[][] res = new int[rowA][colB];
        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                for(int m = 0; m < rowB; m++){
                    res[i][j] += A[i][m] * B[m][j];
                }
            }
        }
        return res;
    }
}