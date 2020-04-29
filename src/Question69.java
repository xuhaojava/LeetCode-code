public class Question69 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        long left = 0;
        long right = x/2;
        while(left < right){
            long mid = (left+right)/2;
            if(mid * mid <= x && (mid + 1)*(mid + 1) > x){
                return (int)mid;
            }else if(mid * mid < x){
                left = mid + 1;
            }else{
                right = mid -1;
            }

        }
        return (int)left;
    }
}
