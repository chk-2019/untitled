package Day70;

import java.util.Arrays;

public class FindRepeatNumber {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i+1<nums.length){
                if (nums[i]==nums[i+1])
                    return nums[i];
            }
        }
        return -1;
    }
}
