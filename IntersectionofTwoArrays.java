class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for (int num : nums1) {
            seen[num] = true;
        }
        int count = 0;
        boolean[] intersectionSeen = new boolean[1001];
        
        for (int num : nums2) {
            if (seen[num] && !intersectionSeen[num]) {
                intersectionSeen[num] = true;
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i <= 1000; i++) {
            if (intersectionSeen[i]) {
                result[index++] = i;
            }
        }
        
        return result;
    }
}
