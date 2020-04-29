import util.ListNode;

import java.util.Stack;

public class Question445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        ListNode node1 = l1;
        while(node1 != null){
            s1.push(node1.val);
            node1 = node1.next;
        }
        ListNode node2 = l2;
        while(node2 != null){
            s2.push(node2.val);
            node2 = node2.next;
        }
        ListNode head = null;
        int flag = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || flag != 0){
            int tem = 0;
            if(!s1.isEmpty()){
                tem = tem + s1.pop();
            }
            if(!s2.isEmpty()){
                tem = tem + s2.pop();
            }
            tem = tem + flag;
            ListNode node = new ListNode(tem % 10);
            flag = tem / 10;
            node.next = head;
            head = node;
        }
        return head;
    }
}
