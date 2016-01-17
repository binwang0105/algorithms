public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum >= target){
                    right--;
                }
                else{
                    cnt += right - left;
                    left++;
                }
                                    
            }
        }
        return cnt;
    }
}