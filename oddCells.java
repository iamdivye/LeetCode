class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowInc = new int[m];
        int[] colInc = new int[n];
        for (int[] idx : indices) {
            rowInc[idx[0]]++;
            colInc[idx[1]]++;
        }
        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if ((rowInc[i] + colInc[j]) % 2 == 1)
                    count++;
        return count;
    }
}
