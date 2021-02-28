package Day28;

public class MaxProfit {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int prices[] = {1,2};
        System.out.println(solution3.maxProfit(prices));
    }
}
class Solution3 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int len = prices.length;
        if (len==0)
            return 0;
        int dp[] = new int[len];
        dp[0]=0;
        min=prices[0];
        for (int i = 1; i < len; i++) {
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            min=prices[i]<min?prices[i]:min;
        }
        return dp[len-1];

    }
}
