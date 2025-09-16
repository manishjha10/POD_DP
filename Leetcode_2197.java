class Solution {
    public long gcd(long a ,long b ){
        
        while(b != 0)
        {
            long temp = a % b; 
            a = b ;
            b = temp;
        }
        return a;
    }
    public ArrayList<Long> find(ArrayList<Long> l) {
      Stack<Long> st = new Stack<>();

      for(Long num : l)
      {
         while(!st.isEmpty() && gcd(st.peek(), num) > 1 )
         {
            Long top = st.pop(); 
            Long newNum = (top*num) / gcd(top, num); 
            num = newNum; 
         }
         st.push(num);
      }
      ArrayList<Long> result  = new ArrayList<>(st); 
      return result; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Long> l = new ArrayList<>(); 
        for(long e : nums) l.add(e);

        ArrayList<Long> res = find(l); 
        List<Integer> ans = new ArrayList<>(); 
         

        //  convert long to int / Long to Int
        for(Long ele : res)
        {
            ans.add(ele.intValue()); 
        }
        return ans; 
    }
}



