package Day20;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int nums[] = {3,7};
        System.out.println( solution3.maxProduct(nums));
    }
}
class Solution3 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len-1]-1)*(nums[len-2]-1);
    }
}