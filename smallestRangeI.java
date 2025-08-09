class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }

        Arrays.sort(nums);
        int minVal = nums[0];
        int maxVal = nums[nums.length - 1];
        
        int potentialScore = maxVal - minVal - 2 * k;

        return Math.max(0, potentialScore);
    }
}
