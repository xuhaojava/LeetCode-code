import util.ListNode;

public class Question206 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode newnode = null;
        while(node!=null){
            ListNode tem = node.next;
            node.next = newnode;
            newnode = node;
            node = tem;
        }
        return newnode;
    }
}
