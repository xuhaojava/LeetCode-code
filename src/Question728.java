import java.util.ArrayList;
import java.util.List;

public class Question728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        for(int i = left;i<=right;i++){
            String tem = String.valueOf(i);
            boolean flag = true;
            for(int j = 0;j<tem.length();j++){
                if(tem.charAt(j)=='0'||i%Integer.parseInt(String.valueOf(tem.charAt(j)))!=0){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}
