class Solution { 
    public int max(int[]  arr)
    {
        int n = arr.length; 
        int[]  nse  = new int[n]; 
        int[]  pse  = new int[n]; 
        
        Stack<Integer> st = new Stack<>(); 
        nse[n-1]=n; 
        st.push(n-1);
        
        for(int i=n-2; i>=0; i--)
        {
           while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop(); 
            if(!st.isEmpty())
            {
                nse[i] = st.peek(); 
            }
            else
            {
                nse[i] = n; 
            }
            st.push(i); 
            
        }
        
        st.clear(); 
        
        st.push(0); 
        pse[0] = -1; 
        
        for(int i=1; i<n; i++)
        {
            
             while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop(); 
            if(!st.isEmpty())
            {
                pse[i] = st.peek(); 
            }
            else
            {
               pse[i]=-1; 
            }
            st.push(i); 
        }
        
        int left = 0;
        int right =0;
        int total = 0; 
        
        for(int i=0; i<n; i++)
        {
            left =  i-pse[i];
            right =  nse[i]-i;
            total += left*right*arr[i]; 
        }
        return total;
    }
    public int min(int[]  arr)
    {
         int n = arr.length; 
        int[]  nse  = new int[n]; 
        int[]  pse  = new int[n]; 
        
        Stack<Integer> st = new Stack<>(); 
        nse[n-1]=n; 
        st.push(n-1);
        
        for(int i=n-2; i>=0; i--)
        {
           while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop(); 
            if(!st.isEmpty())
            {
                nse[i] = st.peek(); 
            }
            else
            {
                nse[i] = n; 
            }
            st.push(i); 
            
        }
        
        st.clear(); 
        
        st.push(0); 
        pse[0] = -1; 
        
        for(int i=1; i<n; i++)
        {
            
             while(!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop(); 
            if(!st.isEmpty())
            {
                pse[i] = st.peek(); 
            }
            else
            {
               pse[i]=-1; 
            }
            st.push(i); 
        }
        
        int left = 0;
        int right =0;
        int total = 0; 
        
        for(int i=0; i<n; i++)
        {
            left =  i-pse[i];
            right =  nse[i]-i;
            total += left*right*arr[i]; 
        }
        return total;
    }
    public int subarrayRanges(int[] arr) {
     int Max  = max(arr);
     int Min  = min(arr); 
     return Math.abs(Max- Min); 
        
    }
}
