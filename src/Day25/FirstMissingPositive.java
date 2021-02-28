package Day25;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {-3,9,16,4,5,16,-4,9,26,2,1,19,-1,25,7,22,2,-7,14,2,5,-6,1,17,3,24,-4,17,15};
        System.out.println(solution.firstMissingPositive(nums));
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length==0)
            return 1;
        int temp = 0;
        for (int i=0;i<nums.length;i++){
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]) {
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1)
                return j+1;
            if (j==nums.length-1)
                return nums.length+1;
        }
        return 0;
    }
}