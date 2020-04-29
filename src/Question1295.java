public class Question1295 {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int x:nums){
            if(String.valueOf(x).length() % 2 == 0){
                sum++;
            }
        }
        return sum;
    }
}
