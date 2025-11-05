import java.util.*; 
class Main {
    public static  long[]  seive(long n)
    {
       boolean[] prime = new boolean[(int)n+1]; 
     
     Arrays.fill(prime, true); 
     
     for(int i=2; i*i<=n; i++)
     {
        for(int j=i*i; j<=n; j+=i)
        {
            if(prime[j])
            {
                prime[j] = false;   //  it is not prime 
            }
        }
     }
     
     ArrayList<Long> l = new ArrayList<>(); 
     for(int i=2; i<=n; i++)
     {
         if(prime[i]) l.add((long)i); 
     }
     
    
     int m = l.size(); 
     long[] arr = new long[m]; 
     for(int i=0; i<m; i++)
     {
         arr[i] = l.get(i); 
     }
    
     
     return arr; 
    } 
    
    public static long solve(long n)
    {
        long[] arr = seive((long)Math.cbrt(n));  //  all prines 
        
        
        long cnt = 0; 
        for(long q: arr)
        {
            long q3 = q*q*q;
            if(q3 > n) break; 
            long limit = n / q3; 
            
            for(long p: arr)
            {
                if(p >= q) break; 
                if(p <= limit)
                {
                    cnt += 1; 
                }
                else break; 
            }
        }
       return cnt;  
    } 
    
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); 
      long ans = solve(N); 
      System.out.println(ans); 
      
    } 
} 
      
     
