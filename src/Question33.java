public class Question33 {
    public int search(int[] nums, int target) {
        int local = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                local = i;
                break;
            }
        }
        int a = erfen(nums,0,local-1,target);
        int b = erfen(nums,local,nums.length-1,target);
        if(a == -1){
            return b;
        }else if(b == -1){
            return a;
        }else{
            return -1;
        }
    }
    public static int erfen(int[] num,int left,int right,int target){
        while(left<=right){
            int mid = (right + left + 1)/2;
            if(target<num[mid]){
                right = mid - 1;
            }else if(target>num[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
