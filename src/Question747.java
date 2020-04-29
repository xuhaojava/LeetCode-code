public class Question747 {
    public int dominantIndex(int[] nums) {
        int maxindex = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > nums[maxindex]){
                maxindex =i;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] * 2 > nums[maxindex] && i != maxindex){
                return -1;
            }
        }
        return maxindex;
    }
}
