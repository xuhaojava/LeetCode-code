import util.ListNode;

public class Question203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode newNode = new ListNode(-1);
        newNode.next = head;
        ListNode temnode = newNode;
        while(temnode.next.next != null){
            if(temnode.next.val == val){
                temnode.next = temnode.next.next;
            }else{
                temnode = temnode.next;
            }
        }
        if(temnode.next.val == val){
            temnode.next = null;
        }
        return newNode.next;
    }
}
