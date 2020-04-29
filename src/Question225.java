import java.util.LinkedList;
import java.util.Queue;

public class Question225 {
    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();
    int top;
    /** Initialize your data structure here. */
    public Question225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(queue1.size()>1){
            top = queue1.remove();
            queue2.add(top);
        }
        int num = queue1.remove();
        Queue<Integer> tem = queue1;
        queue1 = queue2;
        queue2 = tem;
        return num;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

