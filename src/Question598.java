public class Question598 {
    public int maxCount(int m, int n, int[][] ops) {
        for(int a[] : ops){
            m = Math.min(m,a[0]);
            n = Math.min(n,a[1]);
        }
        return m*n;
    }
}
