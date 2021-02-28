package Day35;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}