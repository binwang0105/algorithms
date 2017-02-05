public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int localMin = prices[0];        //买入价格
        int globalMax = 0;
        for(int i = 1; i < n; i++){
            globalMax = Math.max(globalMax, prices[i] - localMin);   //global max at index i
            localMin = Math.min(prices[i], localMin);
            left[i] = globalMax;
        }
        
        int localMax = prices[n-1];    //卖出价格
        globalMax = 0;
        for(int i = n-1; i >=0; i--){
            globalMax = Math.max(globalMax, localMax - prices[i]);
            localMax = Math.max(localMax, prices[i]);
            right[i] = globalMax;
        }
        
        int rst = 0;
        for(int i = 0; i < n-1; i++){
            rst = Math.max(rst, left[i] + right[i+1]);
            
        }
        rst = Math.max(rst, left[n - 1]);
        return rst;
    }
}