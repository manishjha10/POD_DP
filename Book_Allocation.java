class Solution {
    public int findPages(int[] arr, int k) {

     int n  = arr.length; 
     int lo = 0; 
     int hi = 0; 
     int sum  = 0; 
     for(int e : arr) sum  += e; 
     hi =  sum ; 
     int ans = -1; 
     if(k > n) return -1; 
     
     while(lo <= hi)  // log(N)
     {
         int mid  =  lo + (hi-lo)/2; 
         
         if(isItPossible(arr, k , mid) ==  true)
         {
             // we find the minimum  
             ans =  mid ; 
             hi = mid - 1;
         }
         else
         {
             lo =  mid + 1; 
         }
     }
     return ans ; 
    }
    public boolean isItPossible(int[] arr , int k , int mid)
    {
         int stu = 1; 
         int sum  = 0; 
         
         for(int i=0; i<arr.length; i++)   // O(N)
         { 
            if(arr[i] >  mid) return false;  
            
            if(sum + arr[i] <= mid)
            {
                sum  += arr[i]; 
            }
            else
            {
                stu ++; 
                sum  =  arr[i]; 
            }
         }
         if(stu > k) return false; 
         return stu <= k ;
    }
}
