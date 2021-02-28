package Day27;

public class FindMaxForm {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"10", "0001", "111001", "1", "0"};
        System.out.println(solution.findMaxForm(strs,5,3));
    }
}
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        int len = strs.length;
        dp[0][0]=0;
        for (int k=0;k< strs.length;k++){
            String str = strs[k];
            int zeroCount=0;
            int oneCount=0;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)=='0')
                    zeroCount++;
                else
                    oneCount++;
            }
            for (int i=m;i>=zeroCount;i--){
                for (int j =n;j >=oneCount;j--) {
                    dp[i][j]=Math.max(dp[i-zeroCount][j-oneCount]+1,dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }
}
