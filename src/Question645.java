public class Question645 {
    public int[] findErrorNums(int[] nums) {
        int a[] = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            a[nums[i]] = a[nums[i]]+1;
        }
        int num[] = new int[2];
        for(int i =1;i<a.length;i++){
            if(a[i]==2){
                num[0] = i;
            }
            if(a[i]==0){
                num[1] = i;
            }
        }
        return num;
    }
}
