package Day64;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int nums[] = {1,2,3};
        List<List<Integer>> subsets = solution2.subsets(nums);
        System.out.println(subsets);
    }
}
class Solution2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>();
        res.add(new ArrayList<>());
        r1.add(nums[0]);
        res.add(r1);
        for (int i = 1; i < nums.length; i++) {
            res = subsets_helper(res,nums[i]);
        }
        return res;
    }
    public List<List<Integer>> subsets_helper(List<List<Integer>> ruCan,int num){
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(ruCan);
        for (List<Integer> rc:ruCan){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(rc);
            temp.add(num);
            res.add(temp);
        }
        return res;
    }

    //递归dfs方法二：
    public List<List<Integer>> dfs(int i,List<List<Integer>> rc,int[] nums,String bz){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (i==len-1){
            List<Integer> temp = new ArrayList<>();
            if (bz.equals("left"))
                temp.add(nums[i]);
            res.add(temp);
            return res;
        }
        List<List<Integer>> leftList = dfs(i + 1, res, nums, "left");
        List<List<Integer>> rightList = dfs(i + 1, res, nums, "right");
        leftList.addAll(rightList);
        return leftList;

    }
}