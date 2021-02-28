package Day47;

public class FindLengthOfLCIS {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2,2,2,2,2};
        System.out.println(solution.findLengthOfLCIS(nums));
    }
}
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        int res = 0;
        while(right<len){
            if (right!=0&&nums[right-1]>=nums[right])
                left = right;
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}