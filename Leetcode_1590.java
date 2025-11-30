public class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }
        
        int target = (int)(totalSum % p);
        if (target == 0) return 0;

        if (totalSum % p == 0) return 0;

        Map<Integer, Integer> mp = new HashMap<>(); 
        int curr= 0, res=n; 
       
        mp.put(0,-1); 


        for(int i=0; i< n; i++){ 
            curr = (int)((curr + nums[i]) %p); // prefix sum modulo

            int need = curr - target; 
            need %= p;
            if(need < 0) need += p; 

            if(mp.containsKey(need)){
                res = Math.min(res, i-mp.get(need)); 
            }

            mp.put(curr, i); 
        }
        return (res == n) ? -1 : res;
    }
}
