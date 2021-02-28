package Day20;

public class DeleteDuplicates {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(2);
        solution4.deleteDuplicates(listNode);
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution4 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null==head)
            return head;
        ListNode temp  = head;
        ListNode pre = null;
        while (temp!=null){
            if (pre==null){
                pre=temp;
                temp=temp.next;
            }
            else {
                if (temp.val==pre.val){
                    pre.next=temp.next;
                    temp=pre.next;
                    continue;
                }
                pre=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}
