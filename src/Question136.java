public class Question136 {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int x:nums){
            num ^= x;
        }
        return num;
    }
}
