import util.ListNode;

public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode newnode = new ListNode(0);
        newnode.next = head;
        ListNode test = head;
        while(test != null){
            length++;
            test = test.next;
        }
        length = length - n;
        test = newnode;
        while(length != 0){
            length--;
            test = test.next;
        }
        test.next = test.next.next;
        return newnode.next;

    }
}
