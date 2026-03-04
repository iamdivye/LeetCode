import java.util.*;
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        
        sumA=Arrays.stream(aliceSizes).sum();
        sumB=Arrays.stream(bobSizes).sum();

        int diff = (sumB - sumA) / 2;
        
        HashSet<Integer> bobSet = new HashSet<>();
        for (int b : bobSizes) {
            bobSet.add(b);
        }
        
        for (int a : aliceSizes) {
            int target = a + diff;
            if (bobSet.contains(target)) {
                return new int[]{a, target};
            }
        }
        
        return new int[0];
    }
}
