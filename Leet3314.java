class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size(); 
        int[]  ans  = new int[n]; 
        for(int i=0; i<n; i++)
        {
            int original = nums.get(i);
            int cand = -1; 

            for(int j=1; j < original; j++)
            {
                if((j | (j+1)) == original)
                {
                   cand = j; 
                   break;
                }
            }
            ans[i] = cand; 
        }
        return ans; 
    }
}
