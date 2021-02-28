package Day43;

public class MergeTrees {
    public static void main(String[] args) {

    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution6 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null)
            return t2;
        if (t2==null)
            return t1;
        TreeNode res = new TreeNode(t1.val+t2.val);
        res.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        res.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        return res;
    }
}