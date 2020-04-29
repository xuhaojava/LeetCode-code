import java.util.Arrays;

public class Question869 {
    public boolean reorderedPowerOf2(int N) {
        int[] nums = A(N);
        for(int i = 0;i<31;i++){
            if(Arrays.equals(nums,A(1<<i))){
                return true;
            }
        }
        return false;
    }
    public int[] A(int N){
        int num[] = new int[10];
        while(N > 0){
            num[N%10]++;
            N = N / 10;
        }
        return num;
    }
}
