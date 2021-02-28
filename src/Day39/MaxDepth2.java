package Day39;

import java.util.List;

public class MaxDepth2 {
    public static void main(String[] args) {

    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
class Solution4{
    public int maxDepth(Node root) {
        if (root==null)
            return 0;
        if (root.children==null)
            return 1;
        else{
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < root.children.size(); i++) {
                max = Math.max(max,maxDepth(root.children.get(i)));
            }
            return max+1;
        }
    }
}
