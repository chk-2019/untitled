package Day51;

public class PivotIndex {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {0, 0, 0, 0, 1};
        System.out.println(solution.pivotIndex(nums));
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            right+=nums[i];
        }
        int left=0;
        for (int i = 0; i < nums.length; i++) {
            right-=nums[i];
            if (left==right)
                return i;
            left+=nums[i];
        }
        return -1;
    }
}