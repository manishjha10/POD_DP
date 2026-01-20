class Solution {
    public int numTeams(int[] a) { 
        int cnt = 0;
        for(int i=0; i<a.length-2; i++)
        {
            for(int j=i+1; j< a.length-1; j++)
            {
               for(int k=j+1; k<a.length; k++)
               {
                  if((a[i] > a[j] && a[j] > a[k]) || ((a[i] < a[j] && a[j] < a[k])))
                  {
                    cnt ++; 
                  }
               }
            }
        }
        return cnt; 
    }
}
