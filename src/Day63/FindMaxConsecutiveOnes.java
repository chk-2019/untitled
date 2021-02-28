package Day63;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {

    }
}
class Solution3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                res = Math.max(res,max);
                max = 0;
                continue;
            }
            max++;
        }
        res = Math.max(res,max);
        return res;
    }
}