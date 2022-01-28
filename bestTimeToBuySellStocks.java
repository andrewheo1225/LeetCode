class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }
            else if(prices[i] - minBuy > maxProfit){
                maxProfit = prices[i] - minBuy;
            }
        }
        return maxProfit;
    }
}
/*
the if statement determines the lowest buying point but finding the smaller of two values and putting 
smaller values into the minBuy
the else if statement determines the maxprofit  based on the minBuy
0(N)
