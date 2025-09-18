class Solution {
    public int area(int[] arr)
    {   
        return arr[0] * arr[1]; 
    }
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE; 
        Map<Integer,Integer> mp = new HashMap<>(); 

        for(int[] arr :dimensions)
        {   
           int res = area(arr); //  Ar.Rect
           int dia = arr[0]*arr[0] + arr[1]*arr[1]; // AR.Diagonal
           max = Math.max(max,dia);  // max select diagonal
           mp.put(res, dia); 
        }
        int t = Integer.MIN_VALUE; 
        for(Map.Entry<Integer,Integer> e : mp.entrySet())
        {
            if(e.getValue() == max)
            {
                t = Math.max(e.getKey() , t); 
            }
        }
        return t;
    }
}

//  diagonal area , rectangle area max. 
