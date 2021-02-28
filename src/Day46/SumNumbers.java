package Day46;

public class SumNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));
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
    public int sumNumbers(TreeNode root) {
        int res = sumNumbers_helper(root, 0);
        return res;
    }
    public int sumNumbers_helper(TreeNode root,int val){
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null){
            return val*10+root.val;
        }
        int leftSum = sumNumbers_helper(root.left,val*10+root.val);
        int rightSum = sumNumbers_helper(root.right,val*10+root.val);
        return leftSum+rightSum;
    }
}