import java.util.Iterator;
import java.util.Stack;

public class Question155 {
    Stack stack = new Stack();
    /** initialize your data structure here. */
    public Question155() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return (int)stack.peek();
    }

    public int getMin() {
        int num = (int)stack.peek();
        int tem = 0;
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            tem = (int)iterator.next();
            if(num>tem){
                num = tem;
            }
        }
        return num;
    }
}
