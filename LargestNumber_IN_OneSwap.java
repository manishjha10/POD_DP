public class Solution {
    public String largestSwap(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] last = new int[10];
        
        for (int i = 0; i < n; i++) {
            last[arr[i] - '0'] = i;
        }
        
       for(int i=0; i<n; i++){
           for(int digit = 9 ; digit > arr[i] - '0'; digit -- ){
                if (last[digit] > i) {
                    char temp = arr[i];
                    arr[i] = arr[last[digit]];
                    arr[last[digit]] = temp;
                    return new String(arr);
                }
            }
        }
        return s;
    }
}
