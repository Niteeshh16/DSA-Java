package Arrays;

public class BestTimeToBuyAndSellStocksII {

   static public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i =0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                int profitToday = prices[i] - minPrice;
                if (profitToday > maxProfit) {
                    maxProfit = profitToday;
                }
            }
        }
        return maxProfit;

    }



    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
