import util.ListNode;

public class Question160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        while(pa!=pb){
            if(pa ==  null){
                pa = headB;
            }else{
                pa = pa.next;
            }
            if(pb == null){
                pb = headA;
            }else{
                pb = pb.next;
            }
        }
        return pa;
    }
}
