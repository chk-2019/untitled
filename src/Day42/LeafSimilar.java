package Day42;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.leafSimilar(root1,root2));
    }
}
class Solution2 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> listLeft = leafSimilar_helper(root1);
        List<Integer> listRight = leafSimilar_helper(root2);
        return listLeft.equals(listRight);
    }
    public List<Integer> leafSimilar_helper(TreeNode treeNode){
        List<Integer> res = new ArrayList<>();
        if (treeNode==null){
            return res;
        }
        if (treeNode.left==null&&treeNode.right==null){
            res.add(treeNode.val);
            return res;
        }
        List<Integer> listLeft = leafSimilar_helper(treeNode.left);
        List<Integer> listRight = leafSimilar_helper(treeNode.right);
        listLeft.addAll(listRight);
        return listLeft;
    }
}