public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int[] sellDp = new int[prices.length];

        int[] buyDp = new int[prices.length];
        
        buyDp[0] = -prices[0];
        sellDp[0] = 0;
        
        for(int i = 1; i < prices.length; i++){
            sellDp[i] = Math.max(sellDp[i - 1], buyDp[i - 1] + prices[i]);
            if (i >= 2) {
                buyDp[i] = Math.max(buyDp[i - 1], sellDp[i - 2] - prices[i]);
            } else {
                buyDp[i] = Math.max(buyDp[i - 1], -prices[i]);
            }
        }
        return sellDp[prices.length - 1];
    }
}