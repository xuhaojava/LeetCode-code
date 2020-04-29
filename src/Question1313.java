public class Question1313 {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i+=2){
            sum += nums[i];
        }
        int a[] = new int[sum];
        int index = 0;
        for(int i = 0;i<nums.length;i+=2){
            int num = nums[i];
            int tem = nums[i+1];
            while(num>0){
                a[index] = tem;
                index++;
                num--;
            }
        }
        return a;
    }
}
