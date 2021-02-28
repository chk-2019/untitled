package Day43;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {

    }
}
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res1 = nums[0]*nums[1]*nums[len-1];
        int res2 = nums[len-1]*nums[len-2]*nums[len-3];
        return Math.max(res1,res2);
    }
}