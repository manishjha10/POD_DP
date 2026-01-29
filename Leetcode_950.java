class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); 
        ArrayDeque<Integer> q = new ArrayDeque<>(); 
        if(deck.length <= 2) return deck; 
        q.add(deck[deck.length-1]); 
         
       for(int i=deck.length-2; i>=0; i--){
            //step1) last ko pop kro  
            int top = q.pollLast(); 
            //step2) then pop wale ko first add kro 
            q.addFirst(top); 
            //step3) jo current hai us ko add kro 
            q.addFirst(deck[i]); 
        } 
        int ind =  0;
        int[]  ans = new int[deck.length]; 
        while(!q.isEmpty())
        {
            if(ind < ans.length)ans[ind++] = q.poll();
        }
        return ans; 
    }
} 

// Best Question there is trick of 3 points 
