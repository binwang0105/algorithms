public class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i = 0; i * i <= n; i++){
            dp[(int)Math.pow(i, 2)] = 1;
        }
        
        for(int a = 0; a <= n; a++){
            for(int b = 0; a + (int)Math.pow(b, 2) <= n; b++){
                dp[a + (int)Math.pow(b, 2)] = Math.min(dp[a] + 1, dp[a + (int)Math.pow(b, 2)]);
            }
        }
        
        return dp[n];
    }
}