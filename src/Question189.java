public class Question189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int []nums,int start,int end){
        while(start<end){
            int tem = nums[start];
            nums[start] = nums[end];
            nums[end] = tem;
            end--;
            start++;
        }
    }
}
