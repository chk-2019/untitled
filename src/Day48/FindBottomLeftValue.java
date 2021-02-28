package Day48;

public class FindBottomLeftValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        TreeNode root2 = new TreeNode(0);
        root2.left = new TreeNode(-1);
        Solution solution = new Solution();
        int res = solution.findBottomLeftValue(root);
        System.out.println(res);
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
    public int findBottomLeftValue(TreeNode root) {
        int[] res = findBottomLeftValue_helper(root);
        return res[1];
    }
    //理解错题意
//    public int[] findBottomLeftValue_helper(TreeNode root){
//        int res[]=new int[2];
//        if (root==null)
//            return res;
//        if (root.left==null)
//            return res;
//        if (root.left.left==null&&root.left.right==null){
//            res[0] = 2;
//            res[1] = root.left.val;
//            return res;
//        }
//        int[] leftArr = findBottomLeftValue_helper(root.left);
//        int[] rightArr = findBottomLeftValue_helper(root.right);
//        res[0]=leftArr[0]>=rightArr[0]?leftArr[0]+1:rightArr[0]+1;
//        res[1]=leftArr[0]>=rightArr[0]?leftArr[1]:rightArr[1];
//        return res;
//    }
    public int[] findBottomLeftValue_helper(TreeNode root) {
        int res[] = new int[2];
        if (root==null)
            return res;
        if (root.left==null&&root.right==null){
            res[0]=1;
            res[1]=root.val;
            return res;
        }
        int[] leftArr = findBottomLeftValue_helper(root.left);
        int[] rightArr = findBottomLeftValue_helper(root.right);
        res[0] = leftArr[0]>=rightArr[0]?leftArr[0]+1:rightArr[0]+1;
        res[1] = leftArr[0]>=rightArr[0]?leftArr[1]:rightArr[1];
        return res;
    }
}

