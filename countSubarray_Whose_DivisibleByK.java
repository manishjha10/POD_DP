class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
  Map<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;
            if (rem < 0) rem += k;  // safety for negatives

            int complement = (k - rem) % k;

            // If complement remainders already exist, form pairs
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Update remainder count in map
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
