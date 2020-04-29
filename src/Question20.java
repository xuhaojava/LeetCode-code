import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Question20 {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Map map = new HashMap();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        Stack stack = new Stack();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(!stack.empty()&&map.get(s.charAt(i))==stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
