package Day15;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {
    public static void main(String[] args) {

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> node = new HashSet<>();
        ListNode temp = new ListNode(0);
        temp = head;
        while (temp!=null){
            if (node.contains(temp)){
                return temp;
            }
            node.add(temp);
            temp=temp.next;
        }
        return null;
    }
}
