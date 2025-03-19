public class Main{
public int niceSubarray(int[] nums){
int len  = 1;
int ans  = 0;
int j = 0;
int si = 0 ; //  shrink count 

// ... grow ..
while(j < nums.length){ 

// .. Shrink..
while(ans & nums[j] != 0 ){   //  not equal to my target then shrink the window till we not acheive the desire output 
ans  =  ans ^ nums[si] ;
si ++ ;
}

// .. update.. 
ans  = ans  | nums[j] ;
len = Math.max(len , j - si + 1 ) ;
j ++ ;
}
return len ;
}
}

