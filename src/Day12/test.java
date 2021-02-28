package Day12;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args){

    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    Map<Integer,Integer> inMap = new HashMap<Integer,Integer>();
    int post[] = null;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder;
        for (int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode res = helper_buildTree(0, inorder.length - 1, 0, postorder.length - 1);
        return res;
    }
    public TreeNode helper_buildTree(int is,int ie,int ps,int pe){
        if (is>ie||ps>pe)
            return null;
        int root = post[pe];
        int ri = inMap.get(root);
        TreeNode node = new TreeNode(root);
        node.left = helper_buildTree(is, ri - 1, ps, ps + ri - is - 1);
        node.right = helper_buildTree(ri+1,ie,ps+ri-is,pe-1);
        return node;

    }
}