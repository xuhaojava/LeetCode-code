import util.ListNode;

public class Question24 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode tem = node;
        while(tem.next != null && tem.next.next != null){
            ListNode l = tem.next;
            ListNode r = tem.next.next;
            tem.next = r;
            l.next = r.next;
            r.next = l;
            tem = l;
        }
        return node.next;
    }
}
