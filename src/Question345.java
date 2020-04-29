import java.util.ArrayList;
import java.util.List;

public class Question345 {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList();
        list.add('A');
        list.add('a');
        list.add('E');
        list.add('e');
        list.add('I');
        list.add('i');
        list.add('O');
        list.add('o');
        list.add('U');
        list.add('u');
        int left = 0,right = s.length()-1;
        char c[] = s.toCharArray();
        while(left<=right){
            if(list.contains(c[left])){
                if(list.contains(c[right])){
                    char tem = c[left];
                    c[left] = c[right];
                    c[right] = tem;
                    left++;
                    right--;
                }else{
                    right--;
                }
            }else{
                left++;
            }
        }
        return String.valueOf(c);

    }
}
