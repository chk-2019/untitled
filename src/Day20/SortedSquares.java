package Day20;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        System.out.println(10000*10000);
        Solution solution = new Solution();
        int nums[] = {-4,-1,0,3,10};
        int[] ints = solution.sortedSquares(nums);
        for (int i=0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}