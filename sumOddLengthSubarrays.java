class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int start = 0; start < n; ++start) {
            for (int end = start; end < n; ++end) {
                int length = end - start + 1;
                if (length % 2 == 1) { 
                    int sum = 0;
                    for (int k = start; k <= end; ++k) sum += arr[k];
                    total += sum;
                }
            }
        }
        return total;
    }
}
