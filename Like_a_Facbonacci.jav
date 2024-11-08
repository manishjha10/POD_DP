
class Solution {
    static long solve(int N, int K, ArrayList<Long> arr) {
        //code here 
   ArrayList<Long> list =  new ArrayList<>() ;
  long sum  =   0 ;
  // find sum up to K
for(int i = 0 ;i < K ;i ++) {
 sum += arr.get(i) ;
} 

//  slide add new element and remove first 
for(int i  = K ;i < N ;i++) {
list.add(sum) ;

sum += list.get(i) - list.get(i-K) ;
} 
return list.get(N-1) ;
}
}
