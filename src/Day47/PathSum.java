package Day47;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right= new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        Solution3 solution3 = new Solution3();
        List<List<Integer>> lists = solution3.pathSum(root, 22);
        System.out.println(lists);
    }
}
class Solution3 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> resList = pathSum_helper(root, targetSum);
        for (List<Integer> temp:resList){
            List<Integer> resTemp = new ArrayList<>();
            for (int i = temp.size()-1; i >=0; i--) {
                resTemp.add(temp.get(i));
            }
            res.add(resTemp);
        }
        return res;
    }

    public List<List<Integer>> pathSum_helper(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left==null&&root.right==null){
            if (targetSum==root.val){
                List<Integer> in  = new ArrayList<>();
                in.add(root.val);
                res.add(in);
                return res;
            }
            return res;
        }
        List<List<Integer>> leftList = pathSum_helper(root.left, targetSum - root.val);
        List<List<Integer>> rightList = pathSum_helper(root.right, targetSum - root.val);
        if (!leftList.isEmpty()){
            for (List<Integer> temp:leftList){
                temp.add(root.val);
            }
        }
        if (!rightList.isEmpty()){
            res.addAll(rightList);
            for (List<Integer> temp:rightList){
                temp.add(root.val);
            }
        }
        leftList.addAll(rightList);
        return leftList;
    }

}