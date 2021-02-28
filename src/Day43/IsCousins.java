package Day43;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IsCousins {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isCousins(root,5,4));
    }
}
class Solution2 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList();
        Map<Integer,TreeNode> sonAndFather= new HashMap<>();
        Map<Integer,Integer> nodeAndDepth = new HashMap<>();
        if (root==null)
            return false;
        queue.offer(root);
        int depth=1;
        while (!queue.isEmpty()){
            Queue tempQueue = new LinkedList();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    sonAndFather.put(poll.left.val,poll);
                    nodeAndDepth.put(poll.left.val,depth);
                    tempQueue.add(poll.left);
                }
                if (poll.right!=null) {
                    sonAndFather.put(poll.right.val, poll);
                    nodeAndDepth.put(poll.right.val,depth);
                    tempQueue.add(poll.right);
                }
            }
            depth++;
            queue.addAll(tempQueue);
        }
        if (nodeAndDepth.get(x)==nodeAndDepth.get(y)&&!sonAndFather.get(x).equals(sonAndFather.get(y)))
            return true;
        return false;
    }
}
