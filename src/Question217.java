import java.util.HashSet;
import java.util.Set;

public class Question217 {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet(nums.length);
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
