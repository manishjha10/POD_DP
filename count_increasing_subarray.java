class Solution  {
 int len  =   1 , cn = 0 ; 
        for(int i = 0 ; i < arr.length  -1  ;i++) {
            if(arr[i+1] > arr[i]) {
                len ++ ;
            }
            else  {
                cn += len*(len-1)/ 2 ;  // count add on  length of the continous subarray 
                len = 1 ;
            }
        } 
        if(len > 1) {
            cn += len*(len-1)/2;

        }
        return cn ;  //  return the maximum length of the continous subarray.

}

