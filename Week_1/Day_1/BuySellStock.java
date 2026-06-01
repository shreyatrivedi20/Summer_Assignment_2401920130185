class Solution {
    public int maxProfit(int[] prices) {
       int max_profit=0; 
       int best_buy=prices[0];
       for(int i=1;i<prices.length;i++){
         if(prices[i]>best_buy){
           max_profit=Math.max(max_profit,prices[i]-best_buy);
         }
         best_buy=Math.min(best_buy,prices[i]);
       }
       if(max_profit!=0){
        return max_profit;
       }
       else{
        return 0;
       }
    }
}