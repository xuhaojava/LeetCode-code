import util.ListNode;

public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode temNode = newNode;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temNode.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                temNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temNode = temNode.next;
        }
        if(l1 == null){
            temNode.next = l2;
        }else{
            temNode.next = l1;
        }
        return newNode.next;
    }
}
