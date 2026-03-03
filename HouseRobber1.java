class Solution {
    public int rob(int[] nums){ 
        int[] dp = new int[nums.length]; 
        Arrays.fill(dp,-1);
        return solve(dp, nums, nums.length - 1);
    }

    public int solve(int[] dp, int[] nums, int i) {
        if(i < 0) return 0; 
        if(i == 0) return dp[0] = nums[0];
        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(solve(dp,nums, i-1),  nums[i] + solve(dp,nums,i-2)); 
    }
} 
