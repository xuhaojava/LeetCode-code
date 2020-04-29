import java.util.HashSet;
import java.util.Set;

public class Question349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        for(int x : nums1){
            if(!set1.contains(x)){
                set1.add(x);
            }
        }
        Set<Integer> set2 = new HashSet();
        for(int x : nums2){
            if(set1.contains(x) && !set2.contains(x)){
                set2.add(x);
            }
        }
        int[] a = new int[set2.size()];
        int j = 0;
        for(int x:set2){
            a[j] = x;
            j++;
        }
        return a;
    }
}
