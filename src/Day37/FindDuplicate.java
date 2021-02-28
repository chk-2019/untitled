package Day37;

public class FindDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1,1,2};
        System.out.println(solution.findDuplicate(nums));
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (res[nums[i]]==1)
                return nums[i];
            else res[nums[i]]++;
        }
        return 0;
    }
}