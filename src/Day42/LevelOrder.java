package Day42;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution4 solution4 = new Solution4();
        solution4.levelOrder(root);
    }
}
class Solution4 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue  = new LinkedList();
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        queue.add(root);
        while (!queue.isEmpty()){
            Queue<TreeNode> temp = new LinkedList();
            List<Integer> listTemp = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                listTemp.add(poll.val);
                if (poll.left!=null)
                    temp.add(poll.left);
                if (poll.right!=null)
                    temp.add(poll.right);
            }
            res.add(listTemp);
            queue.addAll(temp);
        }
        return res;
    }
}