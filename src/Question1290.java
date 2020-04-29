import util.ListNode;

public class Question1290 {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null){
            sum += sum + head.val;
            head = head.next;
        }
        return sum;
    }
}
