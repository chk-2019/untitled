package Day62;

public class SwapPairs {
    public static void main(String[] args) {

    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode();
        res.next = head;
        ListNode last = res;//记录上个节点
        while(head!=null&&head.next!=null){
            ListNode next = head.next.next;//记录下下个节点
            head.next.next = head;//2->1
            last.next = head.next;//上个节点->2
            head.next = next;//1->3
            last = head;//把上一个节点更新为换位之后的第二个节点
            head = head.next;//更新head节点
        }
        return res.next;
    }
}