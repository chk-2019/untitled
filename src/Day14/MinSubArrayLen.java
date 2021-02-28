package Day14;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int nums[] = {10,2,3};
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(6,nums));
    }
}
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0)
            return 0;
        int res = Integer.MAX_VALUE;
        int sum=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                //如果和大于s，把i++；把j-i+1的值赋给res(如果j-i+1比res小的话)，sum把nums[i]放进来
                if (sum>=s){
                    if (j-i+1<res){
                        res=j-i+1;
                    }
                    sum=0;
                    continue;
                }
                if (j==nums.length-1)
                    sum=0;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
