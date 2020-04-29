public class Question283 {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                j++;
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
            }
        }
    }
}
