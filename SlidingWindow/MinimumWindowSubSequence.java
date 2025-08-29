package SlidingWindow;
import java.util.*;

public class Minimum_Window_Subsequence {
    public static boolean check(String s1 , String s2)
    {  int i=0, j=0;
       while(i<s1.length() &&  j<s2.length())
       {
           if(s1.charAt(i) == s2.charAt(j))
           {
               j ++ ;
           }
           i++ ;
       }
       return j == s2.length();
    }
    public static String minWindow(String s1  , String s2)
    {   int len = Integer.MAX_VALUE;
        String res = "";

      for(int i=0; i<s1.length(); i++)
      {
          for(int j=i; j<s1.length(); j++)
          {
              String ans = s1.substring(i,j+1);
              if(check(ans, s2))
              {
                  if(ans.length() < len)
                  {
                     len = ans.length();
                     res = ans;
                  }
                  if(len > 0) break ;
              }
          }
      }
      return res;
    }

    public static String minWindow2(String s1 , String s2) {
        int n = s1.length();
        int m = s2.length();
        int minLen = Integer.MAX_VALUE;
        String ans = "" ;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int p1 = i, p2 = 0;

                while (p1 < n && p2 < m) {
                    if (s1.charAt(p1) == s2.charAt(p2)) {
                        p2++;
                    }
                    p1++;
                }

                if (p2 == m) {
                    int end = p1 - 1;
                    p2 = m - 1;


                    // bactrack to min len subseq.
                    while (end >= i) {
                        if (s1.charAt(end) == s2.charAt(p2)) {
                            p2--;
                        }
                        if (p2 < 0) break;
                        end--;
                    }
                    int start = end;
                    int len = p1 - start;
                    if (minLen > len) {
                        minLen = len;
                        ans = s1.substring(start, start + len);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //Basic Approach. TC: O(N^3)
        String s1 = "geeksforgeeks";
        String s2 = "eksrg";
        System.out.println(minWindow("output 1 " + s1,s2));

        //optimal :TC: O(N^2);
        System.out.println(minWindow2("Output 2" +  s1,s2));
    }
}
