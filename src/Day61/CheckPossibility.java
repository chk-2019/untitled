package Day61;

import java.util.Stack;

public class CheckPossibility {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {5,7,1,8};
        System.out.println(solution.checkPossibility(nums));;
    }
}
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<nums[i-1]){
                if (i==1||nums[i]>=nums[i-2]){
                    nums[i-1]=nums[i];
                }
                else{
                    nums[i]=nums[i-1];
                }
                count++;
            }
            if (count>1)
                return false;
        }
        return true;
    }
}