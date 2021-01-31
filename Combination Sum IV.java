class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = target;
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++){
            for (int num:nums){
                if (num > i) continue;
                //for each way you can get to i, add to total ways
                dp[i] += dp[i-num];
            }
            
        }
        return dp[n];   
    }
}
