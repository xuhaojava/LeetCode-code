public class Question169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for(int x : nums){
            if(count == 0){
                num = x;
            }
            count += (num == x)?1:-1;
        }
        return num;
    }
}
