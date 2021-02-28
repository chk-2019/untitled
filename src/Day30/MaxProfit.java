package Day30;

public class MaxProfit {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int prices[] = {1,2,3,0,2};
        System.out.println(solution2.maxProfit(prices));
    }
}
class Solution2 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len==0)
            return 0;
        long dp[][] = new long[len][3];
        //0:不持股，因为之前卖出了股票()。
        //1:持有股票
        //2:不持股,因为今天卖出了股票。
        dp[0][0]=0;
        dp[0][1]=0-prices[0];
        dp[0][2]=0;
        for (int i = 1; i < len; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=dp[i-1][1]+prices[i];
        }
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            res=(int)(Math.max(dp[len-1][i],res));
        }
        return res;
    }
}