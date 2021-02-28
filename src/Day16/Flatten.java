package Day16;

import java.util.ArrayList;
import java.util.List;

public class Flatten {
    public static void main(String[] args) {
        Node test1 = new Node(1);Node test2 = new Node(2);Node test3 = new Node(3);Node test4 = new Node(4);Node test5 = new Node(5);Node test6 = new Node(6);Node test7 = new Node(7);Node test8 = new Node(8);test1.next=test2;test2.next = test3;test2.child=test4;test4.next = test5;test5.next=test8;test5.child = test6;test6.next=test7;test7.prev=test6;test8.prev = test5;test5.prev = test4;test3.prev=test2;test2.prev=test1;
        Solution solution5 = new Solution();
        Node flatten = solution5.flatten(test1);

    }
}
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }
    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
class Solution {
    public Node flatten(Node head) {
        if (head==null)
            return null;
        Node res = new Node();
        List<Node> list = new ArrayList<>();
        helper_flaten(head,list);
        System.out.println(list);
        for (int i=0;i<list.size()-1;i++){
            list.get(i).next=list.get(i+1);
        }
        for (int i=list.size()-1;i>0;i--){
            list.get(i).prev=list.get(i-1);
        }
        return list.get(0);
    }
    public void helper_flaten(Node node,List list){
        if (node==null)
            return;
        Node index = new Node();
        index.val=node.val;
        if (node.child==null&&node.next==null){
            list.add(index);
            return;
        }
        if (node.child!=null){
            list.add(index);
            helper_flaten(node.child,list);

        }
        if (node.next!=null){
            if (node.child==null)
                list.add(index);
            helper_flaten(node.next,list);

        }
    }
}