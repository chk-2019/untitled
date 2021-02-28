package Day28;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int flowerbed[] = {0,1,0};
        solution.canPlaceFlowers(flowerbed,2);
    }
}
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int dp[] = new int[len];
        dp[0]=flowerbed[0]==1?0:1;
        if (dp[0]==1)
            flowerbed[0]=1;
        for (int i = 1; i < len; i++) {
            if (flowerbed[i]==1){
                if (flowerbed[i-1]==1)
                    dp[i]=dp[i-1]-1;
                else
                    dp[i]=dp[i-1];
            }
            else{
                if (flowerbed[i-1]==0){
                    dp[i]=dp[i-1]+1;
                    flowerbed[i]=1;
                }
                else
                    dp[i]=dp[i-1];
            }
        }
        return dp[len-1]>=n;
    }
}