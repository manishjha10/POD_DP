// brute force O(N3)
class Solution {
    public static int longestSubarray(int[] arr) {
      int n  = arr.length;  
      int count = 0 , max= -1, cnt = 0;
     
      for(int i=0; i<n; i++)
      {   cnt = 0 ;
          for(int j=i; j<n; j++)
          {  
              int len = j-i+1 ;
               
                  if(arr[j] > len)
                  {  
                      break; 
                  }
                  else
                  {
                      cnt ++ ;
                      max  = Math.max(max , cnt); 
                  }y
               
          }
           
      }
         
      return max; 
    }
}
