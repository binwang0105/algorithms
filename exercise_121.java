public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[] profit = new int[len];
        profit[0] = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= minPrice) {
                minPrice = prices[i];
                profit[i] = profit[i-1];
            } else {
                profit[i] = Math.max(profit[i-1], prices[i] - minPrice);    
            }
        }
        return profit[len-1];
    }
}