class Solution {
    public String addBinary(String a, String b){ 
        StringBuilder sb = new StringBuilder(); 
        int carry = 0;  
        int i = a.length()-1;
        int j = b.length()-1; 

        while(i >= 0 || j>=0 || carry == 1)
        {
            int sum = carry;

            // for every element 
           if(i >= 0 ) sum  += a.charAt(i--) - '0';
           if(j >= 0 ) sum  += b.charAt(j--) - '0'; 

            sb.append(sum % 2);  // Last ele store  
            carry =  sum / 2;  //  carry store. 
        }

        // reverse the strig
        return sb.reverse().toString(); 
    }
}
