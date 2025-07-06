import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> frequencyMap;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.frequencyMap = new HashMap<>();
        for (int num : nums2) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldValue = nums2[index];
        frequencyMap.put(oldValue, frequencyMap.get(oldValue) - 1);
        if (frequencyMap.get(oldValue) == 0) {
            frequencyMap.remove(oldValue);
        }
        nums2[index] += val;
        int newValue = nums2[index];
        frequencyMap.put(newValue, frequencyMap.getOrDefault(newValue, 0) + 1);
    }
    
    public int count(int tot) {
        int count = 0;
        for (int num : nums1) {
            int complement = tot - num;
            count += frequencyMap.getOrDefault(complement, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
