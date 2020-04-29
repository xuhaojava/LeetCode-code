public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int y=matrix.length-1;
        int x = 0;
        while(y>=0 && x<matrix[0].length){
            if(matrix[y][x]>target){
                y--;
            }else if(matrix[y][x]<target){
                x++;
            }else{
                return true;
            }
        }
        return false;
    }
}
