import java.util.ArrayList;
import java.util.List;

public class Question442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();


        for(int i = 0;i<nums.length;i++){
            int realnum = Math.abs(nums[i]);
            int index = realnum - 1;

            nums[index] = - nums[index];
            if(nums[index] > 0){
                list.add(realnum);
            }
        }
        return list;
    }
}
