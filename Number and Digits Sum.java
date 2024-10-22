class Sol
{    static long  Sod(long num){
     long sum  =  0 ;
    while(num !=0){
        long d = num % 10 ;
        sum += d ;
        num /= 10 ;
    } return sum  ;
}
    public static long numberCount (long N, long K)
    { 
        // long i = 1 ;
        // long count  = 0 , num = 0;
        // while(N >= i){
        //   num = i - Sod(i) ;
        //   if(num >= K){
        //       count ++ ;
        //   }
        //   num  =  0;
        //   i++ ;
        // } 
        
        long st  = 1 , end  =  N  ,  result  = -1 ;
        long  count = 0 , mid = 0 ; 
        while(st <= end){ 
            mid  = st + (end -st)/2 ; 
            if(mid - Sod(mid) >= K){ 
                result  =  mid  ;
                end = mid - 1;
            }else {
                st = mid + 1;}
                
            }
         if(result != -1) {
              return N - result +1 ;
         }
       return 0 ;  
    }
}
