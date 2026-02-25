class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>(); 
        int n  = arr.length; 

        for(int i=0; i<n; i++)
        {
            mp.put(arr[i], Integer.bitCount(arr[i])); 
        }
        
        // sorting 
        Integer[] temp = new Integer[n]; 
        for(int i=0; i<n; i++) temp[i]=arr[i]; 

        Arrays.sort(temp, (a,b)->{
            int cmp = mp.get(a) - mp.get(b); 
            if(cmp == 0) return a-b; 
            return cmp; 
        }); 

        for(int i=0; i<n; i++)
        {
            arr[i] = temp[i]; 
        }
        return arr; 
    }
}
