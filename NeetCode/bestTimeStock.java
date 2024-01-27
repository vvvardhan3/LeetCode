package NeetCode;

public class bestTimeStock {
    public static void stock(){
        int[] prices = {7,1,5,3,6,4};
        // int output = 0;
        // for (int i = 0; i < prices.length-1; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         output = Math.max(output, prices[j]-prices[i]);
        //     }
        // } System.out.println(output);
        int mini = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        stock();
    }
}
