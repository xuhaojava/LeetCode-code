import util.ListNode;

public class Question83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newnode = head;
        ListNode runnode = newnode;
        while(runnode != null && runnode.next != null){
            if(runnode.val == runnode.next.val){
                runnode.next = runnode.next.next;
            }else{
                runnode = runnode.next;
            }
        }
        return newnode;
    }
}
