package InterviewPreparation.Arrays;

public class BestBuySellStocks {
    public static int bestBuySellStocks1(int[] prices) {
        int maxProfit = 0;
        for (int i=0;i<prices.length;i++) {
            for (int j=i+1;j< prices.length;j++) {
                int profit = prices[j]-prices[i];
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static int bestBuySellStocks2(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0;i<prices.length;i++) {

            if (prices[i] < minPrices)
                minPrices = prices[i];
            else if(prices[i] - minPrices > maxProfit)
                maxProfit = prices[i] - minPrices;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        int[] stocks1 = {7,6,4,3,1};
        System.out.println(bestBuySellStocks1(stocks));
        System.out.println(bestBuySellStocks1(stocks1));
        System.out.println(bestBuySellStocks2(stocks));
        System.out.println(bestBuySellStocks2(stocks1));
    }
}
