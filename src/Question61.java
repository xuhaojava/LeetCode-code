import util.ListNode;

public class Question61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode oldnode = head;
        int num = 0;
        for(num = 1;oldnode.next!=null;num++){
            oldnode = oldnode.next;
        }
        oldnode.next = head;
        ListNode newnode = head;
        for(int i = 0;i<num-(k % num)-1;i++){
            newnode = newnode.next;
        }
        ListNode newhead = newnode.next;
        newnode.next = null;
        return newhead;
    }
}
