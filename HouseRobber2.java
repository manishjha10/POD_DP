class Solution {
    public int rob(int[] nums) { 
       int n  = nums.length; 
       if(n == 1) return nums[0]; 
       
       int[] dp1 = new int[n]; 
       int[] dp2 = new int[n];  

       Arrays.fill(dp1,-1); 
       Arrays.fill(dp2,-1); 
       
       int sol1 = solve(dp1, nums,0, nums.length-2); 
       int sol2 = solve(dp2, nums,1, nums.length-1); 
       return Math.max(sol1,sol2); 
    }
    public int solve(int[] dp, int[] nums, int start, int i)
    {
       if(i < start) return 0; 
       if(dp[i] != -1) return dp[i]; 

       return dp[i] = Math.max(solve(dp,nums,start, i-1), 
         nums[i] + solve(dp,nums,start, i-2));
    }
}
