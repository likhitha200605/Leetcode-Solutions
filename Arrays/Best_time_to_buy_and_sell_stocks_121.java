
import java.util.*;
public class Best_time_to_buy_and_sell_stocks_121 {
    public int maxProfit(int[] prices) {
        int minp = prices[0];
        int maxp = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minp;
            maxp = Math.max(maxp, profit);
            minp = Math.min(minp, prices[i]);
        }
        return maxp;
    }
}
