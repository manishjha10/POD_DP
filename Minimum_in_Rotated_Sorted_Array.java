punlic class Main {
  static int findMin(int[] arr) { 
  int low = 0 , high =  arr.length-1;
    if(arr[low]  <= arr[high] )  { return arr[low] ;} // array is not rotated 

     while(low <  high) { 
       int mid  = low + (high - low)/ 2 ;
     if(arr[mid] < arr[high] ) { 
       st =  mid+ 1 ;
     } 
    else {
      high =  mid  ;
    }
     }
  }
  return arr[low] ;
}
