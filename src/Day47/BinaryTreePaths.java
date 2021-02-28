package Day47;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
       Solution2 solution2 = new Solution2();
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.right = new TreeNode(5);
       solution2.binaryTreePaths(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution2 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root==null)
            return res;
        if (root.left==null&&root.right==null){
            res.add(String.valueOf(root.val));
            return res;
        }
        List<String> leftList = binaryTreePaths(root.left);
        List<String> rightList = binaryTreePaths(root.right);
        for (String temp:leftList){
            String s = String.valueOf(root.val)+"->"+temp;
            res.add(s);
        }
        for (String temp:rightList){
            String s = String.valueOf(root.val)+"->"+temp;
            res.add(s);
        }
        return res;

    }
}