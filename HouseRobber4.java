package DP;

public class HouseRobber4 {

    public static int solve(int[] nums, int k){
        int low  = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int e:  nums)
        {
            low = Math.min(low, e);
            high = Math.max(high, e);
        }

        while(low < high)
        {
            int mid  = low + (high - low)/2;

            if(isPoss(nums, k, mid))
            {
                high = mid;
            }
            else low =  mid + 1;
        }
        return low;
    }
    public static boolean isPoss(int[] nums, int k, int cap)
    {
        int count  =0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] <= cap)
            {
                count ++;
                i++;
            }
        }
        return count >= k;
    }
    
    // Time Complexcity:  O(N(logN))

    public static void main(String[] args) {
        int[]  arr = {2,3,5,9};
        int k  = 2;
       int ans  =  solve(arr, k);
        System.out.println(ans);
    }
}
