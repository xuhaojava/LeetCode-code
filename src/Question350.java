import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> map = new HashMap();
        for(int i:nums1){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> list = new ArrayList();
        for(int i : nums2){
            if(map.containsKey(i) && map.get(i)>0){
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int a[] = new int[list.size()];
        for(int i = 0;i<a.length;i++){
            a[i] = list.get(i);
        }
        return a;

    }
}
