class Solution{
  static int trailling_zero(int num ) {
    int ans =  0 , i = 5 , fact = 1 ;      //  i = 5 because trailing zeros having number 5  count the  factors of 5 .
    while(fact != 0) {
      fact = num / i ;
      ans += fact  ;
      i *= 5 ;
    } 
  return ans  ; 
  }
  static int findNum(int n ) {
    int st  = 0 , end =  5* n , ans  = 0 , result = 0 ;
    while(st <=  end) {
      int mid = st +(end -st)/2;
        ans =  trailling(mid) ;
      
      if(ans < n) {
        st =  mid +1 ;
      } 
      else {
        result = mid  ;
        end =  mid - 1 ;   // ans >=  n  [  finding the smallest one .
      }
    }
  return result ;
  }
}
      
