class Solution {
    public boolean isD(char ch)
    {
        return ch-'0' >= 0 && ch-'0' <=9; 
    }
    public int myAtoi(String s) {
        int n = s.length(); 
        int i=0;
        int num=0;
        int sign =1; //+ve

        //1)' '
        while(i<n && s.charAt(i) == ' ') i++; 
        //2)
        if(i<n && s.charAt(i)=='-')
        {
           sign = -1; 
           i++; 
        }
        else if(i < n && s.charAt(i) == '+') i++; 
        
        //3) conversion 
        while(i < n && isD(s.charAt(i)))
        {   
            int digit = s.charAt(i)-'0';
            //overfloe
           // 1)exact
           if(num == Integer.MAX_VALUE/10)
           {
            if(sign == 1)
            {
               if(digit >= 7) return Integer.MAX_VALUE; 
            }
            else
            {
               if(digit >= 8) return Integer.MIN_VALUE; 
            }
           }

           //2) greater overlflow
           if(num > Integer.MAX_VALUE/10)
           {
            if(sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE; 
           }
            num = num * 10 + s.charAt(i) - '0';
            i++;
        }
        return sign * num;
    }
}
