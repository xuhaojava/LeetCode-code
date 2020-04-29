import util.ListNode;

public class Question234 {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode node = head;
        while(head!=null){
            length = length + 1;
            head = head.next;
        }
        int a[] = new int[length];
        for(int i = 0;i<length;i++){
            a[i] = node.val;
            node = node.next;
        }
        boolean flag = true;
        for(int i = 0;i<length;i++){
            if(a[i]!=a[length-i-1]){
                flag = false;
            }
        }
        return flag;
    }
}
