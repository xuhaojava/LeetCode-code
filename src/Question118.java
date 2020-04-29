import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0){
            return list;
        }
        for(int i = 0; i < numRows ; i++){
            List<Integer> tem = new ArrayList();
            if(i<2){
                for(int j = 0;j <= i;j++){
                    tem.add(1);
                }
                list.add(tem);
            }else{
                tem.add(1);
                for(int j = 1;j < i;j++){
                    tem.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
                tem.add(1);
                list.add(tem);
            }

        }
        return list;
    }
}
