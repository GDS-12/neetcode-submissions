class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int profit=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                profit=prices[j]-prices[i];
                if(profit>0) maxprofit = profit>maxprofit ? profit : maxprofit;
                else profit=0;
            }
        }
        return maxprofit;
    }
}
