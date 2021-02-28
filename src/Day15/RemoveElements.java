package Day15;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(1);
//        node1.next= new ListNode(2);
//        node1.next.next = new ListNode(3);
//        node1.next.next.next = new ListNode(4);
        Solution4 solution4 = new Solution4();
        solution4.removeElements(node1,1);
    }
}
class Solution4 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode index = head;
        ListNode pre = null;
        //以index为节点遍历整个链表
        while (index!=null){
            //如果头结点是需要删除的节点
            if (head.val==val){
                pre = head;
                head=head.next;

                index=index.next;
                if (pre==null&&index==null){
                    return null;
                }
                pre.next=index;
                continue;
            }
            //如果尾结点是需要删除的节点
            if (index.next==null&&index.val==val){
                if (pre==null&&index==null){
                    return null;
                }
                pre.next=null;
                break;
            }
            //该节点在中间的情况
            if (index.val==val){
                pre.next=index.next;
                index = index.next;
                continue;
            }
            pre = index;
            index = index.next;
        }
        return head;
    }
}