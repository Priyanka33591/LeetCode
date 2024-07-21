public class LeetCode121 {

    public static int maxProfit(int[] prices) {

        int maximumProfit = 0 ;
        int costPrice = prices[0] ;
        for (int i = 1; i < prices.length ; i++){
            if(costPrice < prices[i])  maximumProfit = Math.max((prices[i] - costPrice ) , maximumProfit) ;
            else costPrice = prices[i];
        }
        return maximumProfit ;
    }

    public static void main(String[] args) {
      int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
