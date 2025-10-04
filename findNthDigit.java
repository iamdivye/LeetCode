class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        long num = start + (n - 1) / digitLength;
        String s = Long.toString(num);
        int index = (int)((n - 1) % digitLength);
        return s.charAt(index) - '0';
    }
}
