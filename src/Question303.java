public class Question303 {
    int[] sum;
    public void NumArray(int[] nums) {
        sum = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            sum[i+1] = nums[i] + sum[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1]-sum[i];
    }
}
