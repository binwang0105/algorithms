public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0) return -1;

        int rows = matrix.length;
        int cols = matrix[0].length;

        return kthHelper(matrix, 0, rows * cols - 1, k);
    }

    private int kthHelper(int[][] matrix, int start, int end, int k){
        int rows = matrix.length;
        int left = start;
        int right = end;
        int pivot = matrix[start / rows][start % rows];

        while(left <= right){
            while(left <= right && matrix[left / rows][left % rows] <= pivot) left++;
            while(left <= right && matrix[right / rows][right % rows] >= pivot) right--;

            if(left < right) swap(matrix, left, right);
        }
        swap(matrix, start, right);

        if(right + 1 == k){
            return matrix[right / rows][right % rows];
        } else if(right + 1 < k){
            return kthHelper(matrix, right + 1, end, k);
        } else {
            return kthHelper(matrix, start, right - 1, k);
        }
    }

    private void swap(int[][] matrix, int a, int b){
        int rows = matrix.length;

        int temp = matrix[a / rows][a % rows];
        matrix[a / rows][a % rows] = matrix[b / rows][b % rows];
        matrix[b / rows][b % rows] = temp;
    }
}