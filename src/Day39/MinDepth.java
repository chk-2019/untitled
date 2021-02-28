package Day39;

public class MinDepth {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        TreeNode root = new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        System.out.println(solution3.minDepth(root));
    }
}
class Solution3 {
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null&&root.right!=null)
            return minDepth(root.right)+1;
        if (root.left!=null&&root.right==null)
            return minDepth(root.left)+1;
        else
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
