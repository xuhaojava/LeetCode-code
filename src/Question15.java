import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        if(nums.length < 3){
            return list;
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                break;
            }
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int L = i+1;
            int R = nums.length-1;
            while(L < R){
                List<Integer> tem = new ArrayList();
                if(nums[i]+nums[L]+nums[R] == 0){
                    tem.add(nums[i]);
                    tem.add(nums[L]);
                    tem.add(nums[R]);
                    list.add(tem);
                    while(L<R && nums[L] == nums[L+1]){
                        L++;
                    }
                    while(L<R && nums[R] == nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }else if(nums[i]+nums[L]+nums[R] > 0){
                    R--;
                }else if(nums[i]+nums[L]+nums[R] < 0){
                    L++;
                }
            }
        }
        return list;
    }
}
