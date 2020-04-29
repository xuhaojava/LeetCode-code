public class Question367 {
    public boolean isPerfectSquare(int num) {
        double i = 1;
        while(i*i<num){
            i++;
        }
        return i*i==num;
    }
}
