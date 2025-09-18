class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length; 
        int lo = 0 , high =  n-1;  

        //  Edge Cases. 
        if(n ==1) return nums[0]; 
        if(nums[0] != nums[1]) return nums[0]; 
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        while(lo <= high)
        {
            int mid  = lo + (high - lo)/2;  
            if(nums[mid] != nums[mid-1] &&  nums[mid] != nums[mid+1]) return nums[mid];  

            //  elimination left half (even, odd):   odd -< even || even -> odd 
            if(mid %  2 == 1 && nums[mid] == nums[mid-1]  || mid % 2 == 0 && nums[mid] == nums[mid+1])
            {
                lo = mid +1 ; 
            }

            else
            {
                high = mid - 1;     // right half eleiminate. 
            }
        }
        return -1; 
    }

}
