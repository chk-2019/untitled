package Day15;

public class ReverseList {
    public static void main(String[] args) {

    }
}
class Solution3 {
        public ListNode reverseList(ListNode head) {
            if (head==null)
                return null;
            ListNode cur = head;
            ListNode ne = head.next;
            while (ne!=null){
                ListNode temp=ne.next;
                ne.next=cur;
                cur=ne;
                ne=temp;
            }
            head.next=null;
            return cur;
        }
}
