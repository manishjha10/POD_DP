class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] Word = s.split(" "); 
        if(pattern.length() != Word.length) return false; 

        HashMap<Character, String> map1 = new HashMap<>(); 
        HashMap<String, Character> map2 = new HashMap<>(); 


        for(int i=0; i<pattern.length(); i++)
        {
            char ch = pattern.charAt(i); 
            String word = Word[i]; 
             
            // character to word match 
            if(map1.containsKey(ch))
            {
                if(!map1.get(ch).equals(word)) return false;
            } // word to character match 
            else if(map2.containsKey(word))
            {
                if(!map2.get(word).equals(ch)) return false; 
            }
            else
            {
                map1.put(ch, word); 
                map2.put(word, ch);
            }
        }
        return true; 
    }






  //////////////////// Main crunch of question is mapping we map character to string then string to character and check simultaniously ///////////////





  
}
