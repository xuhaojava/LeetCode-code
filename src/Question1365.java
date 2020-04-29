import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []fre = new int[101];
        Arrays.fill(fre,-1);
        for(int x:nums){
            fre[x]++;
        }
        Map<Integer,Integer> map = new HashMap();
        int num = nums.length;
        for(int i = 100;i>=0;i--){
            if(fre[i]!=-1){
                num -= (fre[i]+1);
                map.put(i,num);
            }
        }
        int []a = new int[nums.length];
        for(int i = 0;i<a.length;i++){
            a[i] = map.get(nums[i]);
        }
        return a;
    }
}
