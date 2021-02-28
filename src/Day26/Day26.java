package Day26;

public class Day26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.waysToStep(61));
    }
}
class Solution {
    public int waysToStep(int n) {
        if (n<3)
            return n;
        long dp[] = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return (int)dp[n];
    }
}