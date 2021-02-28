package Day17;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int nums[] = {0,2,3,4,6,8,9};
        System.out.println(solution3.summaryRanges(nums));
    }
}
class Solution3 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<nums.length;i++){
            if (i==0)
                sb.append(String.valueOf(nums[0]));
            else if (nums[i]==nums[i-1]+1){
                if (sb.equals(String.valueOf(nums[i-1]))){
                    sb.append("->");
                    sb.append(String.valueOf(nums[i]));
                }
                else{
                    sb.replace(sb.length()-1,sb.length()-1,String.valueOf(nums[i]));
                }
                continue;
            }
            else{
                res.add(sb.toString());
                sb.delete(0,sb.length());
                sb.append(String.valueOf(nums[i]));
            }

        }
        return res;
    }
}
