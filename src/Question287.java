import java.util.HashSet;
import java.util.Set;

public class Question287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(Integer i:nums){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
}
