package Day12;

import java.util.HashMap;
import java.util.Map;

public class test02 {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        pre = preorder;
        for (int i=0;i<inorder.length;i++){
            mapIn.put(inorder[i],i);
        }
        TreeNode treeNode = helper_buildTree2(0, inorder.length-1, 0, preorder.length - 1);
        return treeNode;

    }
    Map<Integer,Integer> mapIn = new HashMap();
    int pre[] = null;
    public TreeNode helper_buildTree2(int is,int ie,int ps,int pe){
        if (is>ie||ps>pe)
            return null;
        int root = pre[0];
        int ri = mapIn.get(root);
        TreeNode node = new TreeNode(root);
        node.left = helper_buildTree2(is,ri-1,ps+1,ps+ri-is);
        node.right = helper_buildTree2(ri+1,ps+ri-is,ps+ri-is+1,pe);
        return node;
    }
}
