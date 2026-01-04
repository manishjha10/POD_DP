class Solution {
    public double dfs(String src, String target, double prod, HashSet<String> vis, HashMap<String , HashMap<String,Double>> mp )
    {
        double ret =-1.0;
        vis.add(src);
        if(src.equals(target))
        {
            vis.remove(src);
            return prod; 
        }
        if(mp.get(src).containsKey(target))
        {
            ret = mp.get(src).get(target) * prod; 
        }
        else
        {
            for(String neigh: mp.get(src).keySet())
            {
                if(!vis.contains(neigh))
                {
                    ret = dfs(neigh, target, prod*
                    mp.get(src).get(neigh), vis, mp); 
                    if(ret != -1)
                    {
                        break; 
                    }
                }
            }
        }
        vis.remove(src);
        return ret; 
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // get adj map
        HashMap<String , HashMap<String,Double>> mp = new HashMap<>();
        for(int i=0; i<equations.size(); i++)
        {
            String dividend = equations.get(i).get(0); 
            String divisior = equations.get(i).get(1); 
            double res = values[i]; 
            if(!mp.containsKey(dividend))
            {
                mp.put(dividend, new HashMap<String, Double>()); 
            }  
            if(!mp.containsKey(divisior))
            {
                mp.put(divisior, new HashMap<String, Double>());
            }
            mp.get(dividend).put(divisior, res); 
            mp.get(divisior).put(dividend, 1.0/res);
        }


        double[] res = new double[queries.size()];
        for(int i=0; i<queries.size(); i++)
        {
            String divided = queries.get(i).get(0); 
            String divisior = queries.get(i).get(1); 
            if(!mp.containsKey(divided) || !mp.containsKey(divisior))
            {
                res[i] = -1.0; 
            }
            else if(divided.equals(divisior)) res[i] = 1.0; 
            else
            {
               HashSet<String> vis = new HashSet<>(); 
               res[i] = dfs(divided, divisior, 1.0, vis, mp);
            }
        }
        return res;
    } 
}
