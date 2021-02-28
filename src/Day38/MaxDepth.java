package Day38;

import java.util.List;
import java.util.Stack;

public class MaxDepth {
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
//class Solution {
////    public int maxDepth(Node root) {
////        int res = 0;
////        int depth = 0;
////        Stack<Node> stack = new Stack<>();
////        if (root == null){
////            return res;
////        }
////        stack.push(root);
////        depth++;
////        res = Integer.max(res,depth);
//////        while ()
////    }
//}
