class Solution {
    public int gcd(int a, int b)
    {
        while(b != 0)
        {
          int t =b;   
          b = a % b;
          a = t; 
        }
        return a; 
    }
    public int minOperations(int[] nums) {
        
          int n =  nums.length; 
          int one = 0; 
          int gc =0;  

          for(int x: nums)
          {
            if(x == 1)
            {
                one ++ ;
            }
            gc = gcd(gc, x); 
          } 

          if(one > 0) return n - one;  
          if(gc > 1) return -1; 

          int min = n; 
          for(int i=0; i<n; i++)
          {
            int curr = 0; 
            for(int j=i; j<n; j++)
            {
                curr = gcd(curr, nums[j]); 
               
                if(curr == 1)
                {
                    min = Math.min(min, j-i+1); // min update rest length of array 
                    break;
                }
            }
          }
          return min + n - 2;   // total 
    }
}
  
