class Solution {
    public int area(int[] arr)
    {   
        return arr[0] * arr[1]; 
    }
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE; 
        ArrayList<int[]> l = new ArrayList<>();

        for(int[] arr :dimensions)
        {   
           int res = area(arr); //  Ar.Rect
           int dia = arr[0]*arr[0] + arr[1]*arr[1]; // AR.Diagonal
           max = Math.max(max,dia);  // max select diagonal
          l.add(new int[]{res, dia}); 
        }
        int t = Integer.MIN_VALUE; 
        for(int[] e : l)
        {
            if(e[1] == max)
            {
                t = Math.max(t,e[0]); 
            }
        }
        return t;
    }
}

//  diagonal area , rectangle area max. 
