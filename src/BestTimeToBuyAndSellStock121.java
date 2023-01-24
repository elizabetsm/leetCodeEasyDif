public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int [] prices1 = {7,6,4,3,1};
        int [] prices2 = {4};
        int [] prices3 = {1,2,4};


        System.out.println(maxProfit(prices) == 5);
        System.out.println(maxProfit(prices1) == 0);
        System.out.println(maxProfit(prices2) == 0);
        System.out.println(maxProfit(prices3) == 3);
    }

    public static int maxProfit(int[] prices) {

        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int left = prices[0];
        int right = prices[1];
        int maxProfit = 0;

        for (int i = 1; i < prices.length ; i++) {
            if (right - left > 0) {
                if (right - left > maxProfit) {
                    maxProfit = right - left;
                }
            } else {
                left = prices[i];
            }
            right = prices[i == prices.length-1? i : i+1];
        }
        return maxProfit;
    }
}
