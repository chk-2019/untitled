package Day38;

import javax.naming.LinkLoopException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        solution.levelOrderBottom(treeNode);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Queue<TreeNode> tempQue = new LinkedList<>();
            List<Integer> listTemp = new ArrayList<>();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    tempQue.offer(poll.left);
                }
                if (poll.right!=null){
                    tempQue.offer(poll.right);
                }
                listTemp.add(poll.val);
            }
            res.add(listTemp);
            queue = tempQue;
        }
        List<List<Integer>> resReverse = new ArrayList<>();
        for (int i = res.size()-1; i >= 0; i--) {
            resReverse.add(res.get(i));
        }
        return resReverse;
    }
}