package Day42;

import java.util.function.IntFunction;

public class IsBalanced {
    public static void main(String[] args) {

    }
}
class Solution3 {
    public boolean isBalanced(TreeNode root) {
            return isBalanced_helper(root)!=-1;
    }
    public int isBalanced_helper(TreeNode root){
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        int leftDepth = isBalanced_helper(root.left);
        int rightDepth = isBalanced_helper(root.right);
        if (leftDepth==-1||rightDepth==-1||Math.abs(leftDepth-rightDepth)>1)
            return -1;
        return Math.max(leftDepth,rightDepth)+1;
    }
}