package Day58;

public class FindMaxAverage {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {5};
        System.out.println(solution.findMaxAverage2(nums,1));
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k-1;
        int len = nums.length;
        int temp=0;
        int sum = 0;
        while (temp<k){
            sum+=nums[temp];
            temp++;
        }
        double res = sum/(double)k;
        while (right<len){
           if (k-1!=right){
               sum+=nums[right];
               sum-=nums[left-1];
           }
           res = Math.max(sum/(double)k,res);
           left++;
           right++;
        }
        return res;
    }
    public double findMaxAverage2(int[] nums, int k) {
        int left=0;
        int right=k-1;
        int len = nums.length;
        int temp=0;
        int sum = 0;
        while (temp<k){
            sum+=nums[temp];
            temp++;
        }
        int max = sum;
        while (right<len){
            if (right!=k-1){
                sum = sum-nums[left-1]+nums[right];
                max = Math.max(sum,max);
            }
            right++;
            left++;
        }
        return max/(double)k;
    }
}