

import java.util.* ;
public class find_Common_Elements_Between_Two_Arrays {
    static int[]  findCommonElements(int[] nums1  ,int[] nums2){
        Set<Integer>  set2 = new HashSet<>() ;       //  for nums2  array

        for(Integer  num : nums2) {   // elements of nums2 add in set2
            set2.add(num);
        }


        int answer1 = 0  ;          //  for store the occurences of the nums2 of set2  in nums1 ;
        for(Integer num  : nums1){
            if(set2.contains(num)){
                answer1 ++ ;
            }
        }


        Set<Integer> set1  = new HashSet<>() ;
        for(int num :  nums1){
            set1.add(num) ;
        }

        int answer2 = 0 ;
        for(Integer num : nums2) {   // check the occurences of the num1 of set1 in nums2 ;
            if(set1.contains(num)) {
                answer2 ++ ;
            }
        }
        return new int[] {answer2 ,answer1} ;
    }
    public static void main(String[] args) {
        int[]  nums1 = {2,2,5,2,3,6} ;
        int[]  nums2 = {4,3,2,3,1} ;


        int[]  ans =  findCommonElements(nums1 ,nums2) ;
        for(int i :  ans) {
            System.out.print(i + " ");
        }

    }
}
