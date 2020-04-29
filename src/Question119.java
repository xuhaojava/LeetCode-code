import java.util.ArrayList;
import java.util.List;

public class Question119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(rowIndex == 0){
            List<Integer> ll = new ArrayList();
            ll.add(1);
            return ll;
        }
        for(int i = 0;i<rowIndex+1;i++){
            List<Integer> l = new ArrayList<Integer>();
            if(i<2){
                for(int j = 0;j<=i;j++){
                    l.add(1);
                }
                list.add(l);
            }else{
                l.add(1);
                for(int j = 1;j<i;j++){
                    l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
                l.add(1);
                list.add(l);
            }

        }
        return list.get(rowIndex);
    }
}
