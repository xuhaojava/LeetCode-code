import java.util.ArrayList;
import java.util.List;

public class Question912 {
    public List<Integer> sortArray(int[] nums) {
        List<Integer> list = new ArrayList();
        kuaipai(nums,0,nums.length-1);
        for(int num:nums){
            list.add(num);
        }
        return list;
    }

    public void kuaipai(int[] nums,int start,int end){
        int i = start;
        int j = end;
        if(i>=j){
            return;
        }
        boolean flag = true;
        while(i != j){
            if(nums[i]>nums[j]){
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
                flag = !flag;
            }
            if(flag){
                j--;
            }else{
                i++;
            }
        }
        i--;
        j++;
        kuaipai(nums,start,i);
        kuaipai(nums,j,end);
    }
}
