public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
            
        int left = helper(nums, 0, nums.length - 2);
        int right = helper(nums, 1, nums.length - 1);
        
        return Math.max(left, right);
    }
    
    private int helper(int[] nums, int start, int end){
        int n = nums.length - 1;
        int[] dp = new int[n];
        
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(nums[i + start] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n-1];
    }
}