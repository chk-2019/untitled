package Day30;

public class Partition {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode listLessThan = new ListNode(0);
        ListNode index1= listLessThan;
        ListNode listMoreThan = new ListNode(0);
        ListNode index2 = listMoreThan;
        while (head!=null){
            if (head.val<x)
            {
                index1.next=head;
                head=head.next;
                index1=index1.next;
                index1.next=null;
            }
            else {
                index2.next=head;
                head=head.next;
                index2=index2.next;
                index2.next=null;
            }

        }
        index1.next=listMoreThan.next;
        return listLessThan.next;
    }
}