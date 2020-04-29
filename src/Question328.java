import util.ListNode;

public class Question328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode left = head;
        ListNode right = head.next;
        ListNode thead = right;
        while(right != null && right.next != null){
            left.next = right.next;
            left = left.next;
            right.next = left.next;
            right = right.next;
        }
        left.next=thead;
        return head;
    }
}

