import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            int tem = target - nums[i];
            if(map.containsKey(tem)){
                return new int[]{
                        map.get(tem),i
                };
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
