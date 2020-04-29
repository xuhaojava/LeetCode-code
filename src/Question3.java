import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null && s.length()==0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int max = 0;
        for(int i = 0;i<s.length()-1;i++){
            Set<Character> set = new HashSet();
            int length = 0;
            for(int j = i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    length++;
                }
            }
            if(max<length){
                max = length;
            }
        }
        return max;

    }
}
