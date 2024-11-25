class Solution{
static void swap(int[]  arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public void sortColors(int[] nums) {
        //  use Dutch National flag Algorithm  
        int low   = 0 ;
        int mid   = 0 ;
        int end =  nums.length - 1 ;

        while(mid  <=  end){
            if(nums[mid] == 0){
            swap(nums , mid , low) ;
            low ++ ;
            mid ++ ;
            }

            else if(nums[mid] == 1){
                mid ++ ;
            }
            else{
                swap(nums , mid , end) ;
                 end -- ;
            }
        }
    }
}
