class Solution {
    public int maxProfit(int[] prices) {

        int minPrice=prices[0];

        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-minPrice;
            maxProfit=Math.max(cost,maxProfit);
            minPrice=Math.min(prices[i],minPrice);
        }

        return maxProfit;
        
    }
}