public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftEnd = left, rightEnd = right;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid;
            } else {
                left = mid;
            }
        }
        if(nums[left] == target) leftEnd = left;
        else if(nums[right] == target) leftEnd = right;
        else leftEnd = -1;

        left = 0;
        right = nums.length - 1;

        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid;
            } else {
                right = mid;
            }
        }
        if(nums[right] == target) rightEnd = right;
        else if(nums[left] == target) rightEnd = left;
        else rightEnd = -1;

        int[] rst = new int[2];
        rst[0] = leftEnd;
        rst[1] = rightEnd;

        return rst;
    }
}