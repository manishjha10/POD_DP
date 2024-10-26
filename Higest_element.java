//  find the peak element in one array is strictly increasing or seconf=d array is strictily decreasing  
class Solution {
  public int PeakElement(List<Integer> a) { 
  int st =   , end =  a.size() - ;
    
    if(a.size() == 1 ) { 
      return n ; } 
    
    while(st < end ) {
      int mid =  st + (end - st ) / 2 ;

      if(a.get(mid) < a.get(mid+ 1 ) {   // reduce search space from left side 
        st =  mid + 1 ;
      } 
      else {  //  reduce search space from right side  but up to mid+1 ;
        end =  mid  ;
      } 
    } 
    return a.get(st) ;  //  highest element ;
  }
}
        
        
