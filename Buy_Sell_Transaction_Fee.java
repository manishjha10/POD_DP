class Solution {
    public int maxProfit(int[] prices, int fee) { 
       int n = prices.length; 
       int[][] dp = new int[n][2]; 
       for(int[] ele:  dp)
       {
           Arrays.fill(ele,-1); 
       } 

       return helper(0,0, dp, prices, fee); 
    } 

    //0: buy , 1: Sell 
    public int helper(int i, int state, int[][] dp, int[]  price, int fee)
    {
        if(i == price.length) return 0; 

        if(dp[i][state] != -1) return dp[i][state];  
        int ans = 0; 

        if(state == 1)
        {
            int sell = price[i] - fee +  helper(i+1, 0, dp, price, fee); 
            int skip = helper(i+1, 1, dp, price, fee); 
            ans = Math.max(sell , skip); 
        }
        else // 0
        {
            int buy = -price[i] + helper(i+1, 1, dp, price, fee); 
            int skip = helper(i+1, 0, dp, price, fee); 
            ans = Math.max(buy , skip); 
        }
    return dp[i][state] = ans; 
    }
} 
