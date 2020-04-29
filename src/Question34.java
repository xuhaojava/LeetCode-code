public class Question34 {
    public int[] searchRange(int[] nums, int target) {
        int local[] = {-1,-1};
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                local[0] = i;
                break;
            }
        }
        if(local[0] == -1){
            return local;
        }
        for(int i = nums.length - 1;i>=0;i--){
            if(nums[i] == target){
                local[1] = i;
                break;
            }
        }
        return local;
    }
}
