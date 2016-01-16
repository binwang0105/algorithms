public class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                pos = i;
            }
        }
        return pos;
    }
}