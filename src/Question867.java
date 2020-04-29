public class Question867 {
    public int[][] transpose(int[][] A) {
        int R = A.length,C = A[0].length;
        int a[][] = new int[C][R];
        for(int r = 0;r<R;r++){
            for(int c = 0;c<C;c++){
                a[c][r] = A[r][c];
            }
        }
        return a;
    }
}
