package Day43;

public class RangeSumBST {
    public static void main(String[] args) {

    }
}
class Solution5 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res=0;
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null){
            if (root.val>=low&&root.val<=high)
            return root.val;
            else
                return 0;
        }
        res+=rangeSumBST(root.left,low,high);
        if (root.val>=low&&root.val<=high)
            res+=root.val;
        res+=rangeSumBST(root.right,low,high);
        return res;
    }
}