package Day26;

public class MaxSubArray {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int nums[] = {-2,1};
        System.out.println(solution2.maxSubArray(nums));
    }
}
class Solution2 {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        if (len==0)
            return 0;
        int dp[] = new int[len];
        int res=Integer.MIN_VALUE;
        dp[0]=nums[0];
        res=Math.max(dp[0],res);
        for (int i=1;i<len;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            res=Math.max(dp[i],res);
        }
        return res;
    }
}