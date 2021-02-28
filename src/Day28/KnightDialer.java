package Day28;

public class KnightDialer {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println();
    }
}
class Solution4 {
    public int knightDialer(int n) {
        int dp[] = new int[n];
        dp[0]=10;
        for (int i=1;i<n;i++){
            dp[i]=(int)((dp[i-1]*9l)%1000000007);
        }
        return dp[n-1];
    }
}
