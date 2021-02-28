package Day42;

public class IsSameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null&&q!=null)
            return false;
        if (q==null&&p!=null)
            return false;
        if (q.val!=p.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(q.right,p.right)&&q.val==p.val;
    }
}