import java.util.Stack;

public class Question7 {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        Stack stack = new Stack();
        int pm = 1;
        char num[];
        if(x<0){
            long tem = -(long)x;
            pm = -1;
            num = (tem+"").toCharArray();
        }else{
            num = (x+"").toCharArray();
        }
        for(Character c:num){
            stack.push(c);
        }
        String s = "";
        while(!stack.empty()){
            s += stack.pop();
        }
        long l = Long.valueOf(s);
        if(l>Integer.MAX_VALUE){
            return 0;
        }

        return (int)l*pm;
    }
}
