public class Question167 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length<2){
            return null;
        }
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                return new int[]{low + 1,high + 1};
            }else if(sum < target){
                low++;
            }else{
                high--;
            }
        }
        return null;
    }
}
