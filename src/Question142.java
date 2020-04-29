import util.ListNode;

public class Question142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(slow == fast){
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
