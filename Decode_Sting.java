import java.util.*; 
public class Main{
    public static String check(String s)
    {   
        Stack<String>  str = new Stack<>(); 
        Stack<String>  num = new Stack<>(); 
         
        for(int i=0; i<s.length(); i++)
        {    
             char ch = s.charAt(i);
             
             if(Character.isDigit(ch))
            {
                 int j = i; 
                 StringBuilder sb = new StringBuilder(); 
                 while(j < s.length()  && Character.isDigit(s.charAt(j))) 
                 {
                     sb.append(s.charAt(j));
                     j++; 
                 }
                 num.push(sb.toString());                 
                 i = j-1; 
            }    
             else if(ch != ']')
             {
                 str.push(String.valueOf(ch));
             }
             else
             {
                 // ch == ']' work '['
                 StringBuilder sb1 = new StringBuilder();
                 while(!str.isEmpty() && !str.peek().equals("["))
                 {
                    sb1.insert(0, str.pop());  
                 }
                 if(!str.isEmpty() && str.peek().equals("[")) str.pop(); 
                 
                 int num1 =  Integer.parseInt(num.pop());
                 StringBuilder mul = new StringBuilder();
                 String res = sb1.toString(); 
                 
                 while(num1 -- > 0) mul.append(res); 
                 str.push(mul.toString()); 
             }
        }
             StringBuilder ans = new StringBuilder(); 
             while(!str.isEmpty())
             {
                 ans.insert(0, str.pop()); 
             }
             return ans.toString(); 
    }
    public static void main(String[] args)
    {
        System.out.println(check("3[b2[ca]]")); 
    }
}


