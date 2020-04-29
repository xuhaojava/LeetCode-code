public class Question704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if(low > high || target<nums[low] || target > nums[high]){
            return -1;
        }
        while(low<=high){
            mid = (low + high) / 2;
            if(target < nums[mid]){
                high = mid - 1;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
