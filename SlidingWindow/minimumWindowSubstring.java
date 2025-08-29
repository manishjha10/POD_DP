package SlidingWindow;
import java.util.HashMap;

public class Minimum_Window_SubString {
    public static String minWindowSubString(String s , String t)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int startIndex = -1 ;
        int uniqueCharCount = mp.size();

        while(windowEnd < n)
        {
            // Expansion Phase .
            char ch = s.charAt(windowEnd);
            if(mp.containsKey(ch))
            {
                mp.put(ch, mp.get(ch)-1);

                if(mp.get(ch) == 0){
                    uniqueCharCount --;   // character is not unique now occurence is zero.
                }
            }

            //Shrink phase
            while(uniqueCharCount == 0){
                int len = windowEnd - windowStart + 1 ;
                if(len < minLen)
                {
                    minLen = len ;
                    startIndex = windowStart;
                }

                char leftChar = s.charAt(windowStart);
                if(mp.containsKey(leftChar))
                {
                    // expnsion
                    mp.put(leftChar, mp.get(leftChar)+1);
                    if(mp.get(leftChar) > 0) {
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }
            windowEnd ++ ;
        }

        if(startIndex == -1) return "" ;

        return s.substring(startIndex, startIndex + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minWindowSubString(s,t);
        System.out.println("Output " + res);
    }
}
