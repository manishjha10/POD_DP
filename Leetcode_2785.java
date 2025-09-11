class Solution { 
    public boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public String sortVowels(String s) {
     String res  = ""; 
     
     ArrayList<Character> l = new ArrayList<>();
     char[]  ch  = s.toCharArray(); 
     for(char e : ch)
     {
        if(e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u')
        {
          l.add(e); 
        }
        else if(e == 'A' || e == 'E' || e == 'I' || e == 'O' || e == 'U')
        {
            l.add(e);
        }
     }
    

     List<Integer> pos = new ArrayList<>();

    for (int i = 0; i < ch.length; i++) {
      if (isVowel(ch[i])) {
        pos.add(i);
       }
    }


    Collections.sort(l); 
    String temp = "";
    int ind1 = 0;  
    
     for(int i=0; i<ch.length; i++)
     { 
        if(ind1 < pos.size() && i == pos.get(ind1))      // pos equal to index. 
       {
         temp += l.get(ind1); 
         ind1 ++ ;
       }
       else 
       {
        temp += ch[i]; 
       }
     }

     return temp;  


     //  s1) all vowel store in list and there positon from the original list in other list store 
     //s2)  sort the vower list and chek the original string if that vowel postion come then pick from that vowel list that we sorted before then place in that position and get the result. 
     
    }
}

