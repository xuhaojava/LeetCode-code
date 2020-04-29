public class Question75 {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int index = 0;
        int tem;
        while(index<=right){
            if(nums[index]==0){
                tem = nums[index];
                nums[index] = nums[left];
                nums[left] = tem;
                left++;
                index++;
            }else if(nums[index]==2){
                tem = nums[index];
                nums[index] = nums[right];
                nums[right] = tem;
                right--;
            }else{
                index++;
            }
        }
    }
}
