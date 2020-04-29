public class Question300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int dp[] = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for(int i = 1;i<nums.length;i++){
            int tem = 0;
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    tem = Math.max(tem,dp[j]);
                }
            }
            dp[i] = tem + 1;
            maxans = Math.max(maxans,dp[i]);
        }
        return maxans;
    }
}
