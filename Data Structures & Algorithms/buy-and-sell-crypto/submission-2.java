class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int profit=0;
        for(int i=0; i<prices.length-1; i++){
            prices[i] = prices[i+1]-prices[i];
        }
        prices[prices.length-1]=0;
        for(int i=0; i<prices.length; i++){
            profit += prices[i];
            maxprofit = profit>maxprofit ? profit : maxprofit;
            profit = profit>0 ? profit : 0;
        }
        return maxprofit;
    }
}
