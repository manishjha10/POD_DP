class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0, j=0; 
        char[] ch1 = name.toCharArray(); 
        char[] ch2 = typed.toCharArray();  

        while(j < typed.length())
        {
           if(i < name.length() && ch1[i] == ch2[j])
           {
             i+= 1; 
             j+= 1; 
           }
           else if(j > 0 && ch2[j] == ch2[j-1]) j += 1; 
           else return false;
        }
        if(i==name.length()) return true; 
        return false; 
    }
}
