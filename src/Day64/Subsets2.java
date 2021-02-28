package Day64;

import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
//        Solution3 solution3 = new Solution3();
//        int nums[] = {1,2,3};
//        List<List<Integer>> subsets = solution3.subsets(nums);
//        System.out.println(subsets);
    }
}
class Solution3 {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//
//    }
    //递归dfs方法二：
    public void dfs(int i, List<List<Integer>> rc, List<Integer> subset, int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if (i==nums.length)
            return;
        List<Integer> temp = new ArrayList<>(subset);
        result.add(temp);
        dfs(i+1,result,temp,nums);
        temp.add(nums[i]);
        dfs(i+1,result,temp,nums);
    }
}
