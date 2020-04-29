public class Question59 {
    public int[][] generateMatrix(int n) {
        int a[][] = new int[n][n];
        int left = 0,right = n-1,up = 0,down = n-1;
        int num = 1;
        while(num<=n*n){
            for(int i = left;i<=right;i++){
                a[up][i] = num++;
            }
            up++;
            for(int i = up;i<=down;i++){
                a[i][right] = num++;
            }
            right--;
            for(int i = right;i>=left;i--){
                a[down][i] = num++;
            }
            down--;
            for(int i = down;i>=up;i--){
                a[i][left] = num++;
            }
            left++;
        }
        return a;
    }
}
