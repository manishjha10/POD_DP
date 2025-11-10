class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>(); 
        int cnt = 0;
        st.push(0); 

        for(int i=0; i<nums.length; i++)
        {
            while(!st.isEmpty() && st.peek() > nums[i]) st.pop();

            if(st.isEmpty() || st.peek() < nums[i])
            {
                cnt ++; 
                st.push(nums[i]); 
            }
        }
        return cnt; 
    }
} 

// Think: we set all elements of array to zero  so we compare each elemt of an arry to zero and maintain the comparison of smaller elemnt if greater then pop  and other wise we inc cnt and push that ele . 
