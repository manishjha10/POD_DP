class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length; 
        Integer[][] dp = new Integer[n+1][m+1];
        return helper(grid, 0,0,n-1,m-1,dp); 
    } 
    public int helper(int[][] grid, int sr, int sc,int er, int ec, Integer[][] dp)
    {
        if(sr > er || sc > ec) return Integer.MAX_VALUE-1; 

        if(sr == er && sc == ec) return grid[sr][sc];   // last sr, sc 

        if(dp[sr][sc] != null) return dp[sr][sc]; 

        int right = Integer.MAX_VALUE -1 ;
        int down = Integer.MAX_VALUE -1 ;
         

        if(sr+1 <= er)
           right = helper(grid, sr+1, sc, er, ec, dp);  

        if(sc + 1 <= ec)
           down = helper(grid, sr, sc+1, er, ec, dp); 
        
        dp[sr][sc] = grid[sr][sc] + Math.min(right, down); 
        return dp[sr][sc];
    }
}
