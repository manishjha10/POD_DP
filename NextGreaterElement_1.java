import java.util.* ;
class Solution { 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     HashMap<Integer, Integer> mp = new HashMap<>() ;
     ArrayDeque<Integer> st = new ArrayDeque<>() ;

     for(int num  :  nums2){

        while(!st.isEmpty() &&  st.peek() < num) // on;y work when stack is non empty 
        {
            mp.put(st.pop() , num); //  element correspond greater 
        }
        st.push(num) ;
      } 
     
      //  if stack is non empty but all nums2 element are excess.
      while(!st.isEmpty()){
        mp.put(st.pop() , -1);    //  these ele has no greater element 
      }
      

      int[]  arr= new int[nums1.length];
      for(int i=0;i<arr.length;i++){
        arr[i] = mp.get(nums1[i]) ;
      }

      return arr ;

    }
}
