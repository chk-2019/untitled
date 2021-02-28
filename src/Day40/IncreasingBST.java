package Day40;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(2);
//        test.left = new TreeNode(3);
//        test.right = new TreeNode(6);
//        test.left.left = new TreeNode(2);
//        test.left.right = new TreeNode(4);
//        test.right.right = new TreeNode(8);
//        test.left.left.left = new TreeNode(1);
//        test.right.right.left = new TreeNode(7);
//        test.right.right.right = new TreeNode(9);

        test.left = new TreeNode(1);
        test.right = new TreeNode(4);
        test.right.left = new TreeNode(3);
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.increasingBST(test));
    }
}

class Solution2 {
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> treeNodes = increasingBST_helper(root);
        TreeNode res = new TreeNode();
        TreeNode index = res;
        for (int i = 0; i < treeNodes.size(); i++) {
            index.right = new TreeNode(treeNodes.get(i).val);
            index.left=null;
            index = index.right;
        }
        return res.right;
    }
    public List<TreeNode> increasingBST_helper(TreeNode treeNode){
        List<TreeNode> res = new ArrayList<>();
        if (treeNode==null){
            return res;
        }
        if (treeNode.left==null&&treeNode.right==null){
            res.add(treeNode);
            return res;
        }
        List<TreeNode> treeNodesL = increasingBST_helper(treeNode.left);
        treeNodesL.add(treeNode);
        List<TreeNode> treeNodesR = increasingBST_helper(treeNode.right);
        for (int i = 0; i < treeNodesR.size(); i++) {
            treeNodesL.add(treeNodesR.get(i));
        }
        return treeNodesL;
    }
}