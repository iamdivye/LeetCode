class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int num : nums1) {
            count[num]++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (count[num] > 0) {
                resultList.add(num);
                count[num]--;
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
