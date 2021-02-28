package Day52;

public class MinimumEffortPath {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int heights[][] = {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        System.out.println(solution.minimumEffortPath(heights));
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int gao = heights.length;
        int chang = heights[0].length;
        int dp[][] = new int[gao][chang];
        dp[0][0] = 0;
        for (int i = 1; i < gao; i++) {
            int differ = Math.abs(heights[i][0]-heights[i-1][0]);
            dp[i][0]=Math.max(differ,dp[i-1][0]);
        }
        for (int i = 1; i < chang; i++) {
            int differ = Math.abs(heights[0][i]-heights[0][i-1]);
            dp[0][i] =  Math.max(differ,dp[0][i-1]);
        }
        for (int i = 1; i < gao; i++) {
            for (int j = 1; j < chang; j++) {
                int temp = Math.abs(heights[i][j]-heights[i-1][j]);
                int temp2 = Math.abs(heights[i][j]-heights[i][j-1]);
                dp[i][j] = Math.min(Math.max(temp,dp[i-1][j]),Math.max(temp2,dp[i][j-1]));
            }
        }
        return dp[gao-1][chang-1];
    }
}