public class Question55 {
    public boolean canJump(int[] nums) {
        int jump = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(i + nums[i]>=jump){
                jump = i;
            }
        }
        return jump == 0;
    }
}
