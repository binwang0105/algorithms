public int maxSubSum(int[] arr){

	if(arr.length == 0 || arr == null)
		return 0;
	int max = Integer.MIN_VALUE;
	int[] dp = new dp[arr.length];
	dp[0] = arr[0];
	for(int i = 1; i < arr.length; i++){
		dp[i] = dp[i-1] > 0 ? dp[i-1] + nums[i] : nums[i];
		max = Math.max(dp[i], max);
	}
	return max;
}