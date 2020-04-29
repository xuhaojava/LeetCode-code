import java.util.ArrayList;
import java.util.List;

public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List list = new ArrayList();
        if((matrix==null||matrix.length==0)||(matrix.length==1&&matrix[0].length==0)){
            return list;
        }
        int up = 0,left = 0,down = matrix.length - 1,right = matrix[0].length - 1;
        while(left<=right && up<=down){
            for(int i = left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            up++;
            for(int i = up;i<=down;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(up-1 != down){
                for(int i = right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
            }
            down--;
            if(right+1 != left){
                for(int i =down;i>=up;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}
