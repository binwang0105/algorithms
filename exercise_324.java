public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        
        int[] snums = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            snums[i] = nums[i];
        }
        
        int k = snums.length - 1;
        for(int i = 1; i < nums.length; i = i + 2){
            nums[i] = snums[k--];
        }
        
        k = (snums.length - 1) / 2;
        for(int j = 0; j < nums.length; j = j + 2){
            nums[j] = snums[k--];
        }
    }
}

//对原数组排序，得到排序后的辅助数组snums
//对原数组的偶数位下标填充snums的末尾元素--
//对原数组的奇数位下标填充snums的中间元素--