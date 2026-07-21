// Last updated: 7/21/2026, 5:01:42 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1;i < prices.length; i++){
            minPrice = Math.min(minPrice , prices[i]);
            maxProfit = Math.max(maxProfit, (prices[i] - minPrice));
        }
        return maxProfit;
    }
}