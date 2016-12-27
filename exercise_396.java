public class Solution {
    public int maxRotateFunction(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < A.length; i++){
            max = Math.max(max, computeValue(A));
            rotate(A, 1);
        }
        
        return max;
    }
    
    private void rotate(int[] A, int k){
        k = k % A.length;
        reverse(A, 0, A.length-1);
        reverse(A, k, A.length-1);
        reverse(A, 0, k-1);
    } 
    
    private int computeValue(int[] array){
        int res = 0;
        for(int i = 0; i < array.length; i++){
            res = res + i * array[i];
        }
        return res;
    }
    
    //要有一个reverse函数
    private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}