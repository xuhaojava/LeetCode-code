import java.util.HashSet;
import java.util.Set;

public class Question202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        int m = 0;
        while(true){
            while(n!=0){
                m += Math.pow(n%10,2);
                n = n/10;
            }
            if(m == 1){
                return true;
            }
            if(set.contains(m)){
                return false;
            }else{
                set.add(m);
                n = m;
                m = 0;
            }
        }
    }
}
