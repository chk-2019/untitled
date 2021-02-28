package Day29;

import java.util.Arrays;

public class KnightDialer {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.knightDialer(3131));
    }
}
class Solution2 {
    public int knightDialer(int n) {
        if (n==0)
            return 0;
        long dp[][] = new long[n+1][10];
        for (int j = 0; j < 10; j++) {
            dp[1][j]=1;
        }
        for (int i = 2; i < n+1; i++) {
                dp[i][1]=(dp[i-1][6]+dp[i-1][8])%1000000007;
                dp[i][2]=(dp[i-1][7]+dp[i-1][9])%1000000007;
                dp[i][3]=(dp[i-1][4]+dp[i-1][8])%1000000007;
                dp[i][4]=(dp[i-1][3]+dp[i-1][9]+dp[i-1][0])%1000000007;
                dp[i][5]=0;
                dp[i][6]=(dp[i-1][1]+dp[i-1][7]+dp[i-1][0])%1000000007;
                dp[i][7]=(dp[i-1][2]+dp[i-1][6])%1000000007;
                dp[i][8]=(dp[i-1][1]+dp[i-1][3])%1000000007;
                dp[i][9]=(dp[i-1][2]+dp[i-1][4])%1000000007;
                dp[i][0]=(dp[i-1][4]+dp[i-1][6])%1000000007;
            }
        long res = 0;
        for (int i = 0; i < 10; i++) {
            res+=dp[n][i];
        }
        return (int)(res%1000000007);
    }

}

