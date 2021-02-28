package Day21;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int nums[] = {};
//        System.out.println(solution.summaryRanges(nums));

    }
}
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length==0)
            return res;
        if (nums.length==1){
            res.add(String.valueOf(nums[0]));
            return res;
        }
        int start = 0;
        int end = 0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]+1==nums[i+1]){
                end++;
            }
            else{
                if (start==end){
                    res.add(String.valueOf(nums[i]));
                }
                else{
                    res.add(String.valueOf(nums[start])+"->"+String.valueOf(nums[end]));
                }
                start=end+1;
                end++;
            }
        }
        if(start==end)
            res.add(String.valueOf(nums[start]));
        else
            res.add(String.valueOf(nums[start])+"->"+String.valueOf(nums[end]));
        return res;
    }
}