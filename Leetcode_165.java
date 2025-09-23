class Solution {
    public int compareVersion(String version1, String version2) {
       int i=0, j=0;
       int n = version1.length() , m = version2.length();

       while(i < n || j < m)
       {
         int start1 = i; 
         int start2 = j;

         while(i < n && version1.charAt(i) != '.') i ++ ;
         while(j < m && version2.charAt(j) != '.') j ++ ;
        
        String  str1 = version1.substring(start1 , i);
        String  str2 = version2.substring(start2 , j);  

        int val1 =  str1.isEmpty() ? 0 : Integer.parseInt(str1); 
        int val2 = str2.isEmpty() ? 0 :  Integer.parseInt(str2); 

        if(val1 > val2) return 1; 
        if(val1 < val2) return -1; 
         
        if(i < n) i++; 
        if(j < m) j++;
       }
       return 0; 
    }
}

