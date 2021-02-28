package Day63;

import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int res = solution2.arrayPairSum(new int[]{6,2,6,5,1,2});
        System.out.println(res);
    }
}
class Solution2 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res+=nums[i++];
        }
        return res;
    }
}
