package Day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {};
        System.out.println(solution.findDisappearedNumbers(nums));
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int shu[] = new int[len+1];
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            shu[temp]++;
        }
        List<Integer> res =new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            if (shu[i]==0)
                res.add(i);
        }
        return res;
    }
}