class Solution {
    static  final int  mod = 1000000007; 
    public int numberOfPaths(int[][] grid, int k){
        Integer[][][]  dp = new Integer[grid.length][grid[0].length][k];
        return helper(grid, k%mod, 0,0,grid.length-1, grid[0].length-1,grid[0][0] % k, dp); 
    }
    public static int helper(int[][] grid, int k, int sr, int sc,int er, int ec,int sumMod, Integer[][][] dp)
    {   
        if(sr > er || sc > ec) return 0; 
        
        if(sr == er && sc == ec)
        {
          return (sumMod % k == 0) ? 1 : 0; 
        }
        
        if(dp[sr][sc][sumMod] != null) return dp[sr][sc][sumMod]; 

        int  count = 0; 
        
       //  right call  
       if(sr + 1 <= er){
          
           int nextSumMod = (sumMod + grid[sr+1][sc] ) % k; 
           count += helper(grid, k, sr+1, sc, er, ec, nextSumMod, dp); 
       }
       
       //  down call
       if(sc + 1 <= ec){ 
            int nextSumMod = (sumMod + grid[sr][sc+1] ) % k; 
           count += helper(grid, k, sr, sc+1, er, ec, nextSumMod, dp);
       }
      dp[sr][sc][sumMod] = (count%mod); 
      return dp[sr][sc][sumMod];
    }
}





//  TOP DOWN APPROCH :   











}
