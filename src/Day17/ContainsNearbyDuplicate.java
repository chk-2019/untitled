package Day17;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int test[] = {1,2,3,1,2,3};
        boolean b = solution2.containsNearbyDuplicate(test, 2);
        System.out.println(b);
    }
}
class Solution2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k<=0||nums==null||nums.length==0)
            return false;
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+k;j++){
                if (j>nums.length-1)
                    break;
                if (nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}