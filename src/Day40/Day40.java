package Day40;

public class Day40 {
    public static void main(String[] args) {

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
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        int res = maxDepth(root);
        return res==-1?false:true;
    }
    public int maxDepth(TreeNode root){
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        else{
            int leftDep = maxDepth(root.left);
            int rightDep = maxDepth(root.right);
            if (leftDep==-1||rightDep==-1||Math.abs(leftDep-rightDep)>1)
                return -1;
            else
                return Math.max(leftDep,rightDep)+1;
        }
    }
}