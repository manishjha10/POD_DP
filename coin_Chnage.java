class Solution {
    public int coinChange(int[] coins, int amount) {
        return minimumCoinChnage(coins, amount);
    }
    public static  int minimumCoinChnage(int[] coin, int amount)
    {
        int n = coin.length;
        int[][] dp = new int[n+1][amount+1];

        // first row
        for(int j=0; j<= amount; j++)  dp[0][j] = Integer.MAX_VALUE-1;

        // first column
        for(int i=1; i<dp.length; i++) dp[i][0] = 0;

        // second row
        for(int j=1; j<dp[0].length; j++)
        {
            if(j % coin[0] == 0)
            {
                dp[1][j] = j/coin[0];
            }
            else dp[1][j] =  Integer.MAX_VALUE-1;
        }

        for(int i=2; i<dp.length; i++)
        {
            for(int j=1; j<=amount; j++)
            {
                if(coin[i-1] <= j)
                {
                    //  but we return the count minimim count means minimum coins that we needed  [+1] 
                    dp[i][j] = Math.min(dp[i][j-coin[i-1]] + 1, dp[i-1][j]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return (dp[n][amount] == Integer.MAX_VALUE-1 ? -1 : dp[n][amount]);
    }
}
