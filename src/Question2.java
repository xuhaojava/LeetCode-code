import util.ListNode;

public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode cur = newNode;
        int num = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                num += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                num += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(num % 10);
            num = num / 10;
            cur = cur.next;
        }
        if(num == 1){
            cur.next = new ListNode(num);
        }
        return newNode.next;
    }
}
