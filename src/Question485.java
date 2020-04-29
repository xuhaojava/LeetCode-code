public class Question485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int tem = 0;
        for(int x : nums){
            if(x == 0){
                tem = 0;
            }
            if(x == 1){
                tem++;
                if(tem>sum){
                    sum = tem;
                }
            }
        }
        return sum;
    }
}
