package Day39;

public class MaxDepth {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left=new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxDepth(treeNode));
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
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
