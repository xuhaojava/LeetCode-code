public class Question70 {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int one = 1;
        int second = 2;
        for(int i = 3;i<=n;i++){
            int tem = one + second;
            one = second;
            second = tem;
        }
        return second;
    }
}
