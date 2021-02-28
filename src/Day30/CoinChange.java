package Day30;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int coins[]={186,419,83,408};
        System.out.println(solution3.coinChange(coins,6249));
    }
}
class Solution3 {
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
//        for (int i = 0; i < coins.length; i++) {
//            dp[coins[i]]=1;
//        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i-coins[j]>=0&&i-coins[j]<amount+1){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}
