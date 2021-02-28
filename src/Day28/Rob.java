package Day28;

public class Rob {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int nums[]={2,3};
        solution2.rob(nums);
    }
}
class Solution2 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len==0)
            return 0;
        if (len==1)
            return nums[0];
        if (len==2)
            return Math.max(nums[0],nums[1]);
        int dp[] = new int[len];
        int dp2[] = new int[len];
        //记录选择第一个的最大盗取金额的dp数组
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < len-1; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        //记录不选择第一个的最大盗取金额的dp数组；
        dp2[1]=nums[1];
        dp2[2]=Math.max(nums[1],nums[2]);
        for (int i = 3; i < len; i++) {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        return Math.max(dp[len-2],dp2[len-1]);
    }
}
