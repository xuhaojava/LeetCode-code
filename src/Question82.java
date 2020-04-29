import util.ListNode;

public class Question82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next  == null){
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode slow = node;
        ListNode fast = head;
        while(fast!=null){
            if((fast.next!=null && fast.val != fast.next.val) || fast.next == null){
                if(slow.next == fast){
                    slow = slow.next;
                }else{
                    slow.next = fast.next;
                }
            }
            fast = fast.next;
        }
        return node.next;
    }
}
