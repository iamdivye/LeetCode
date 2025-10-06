class Solution {
    public int getMoneyAmount(int n) {
       int[][] dp = new int[n + 2][n + 2];
        for (int len = 2; len <= n; len++) {
            for (int l = 1; l + len - 1 <= n; l++) {
                int r = l + len - 1;
                int best = Integer.MAX_VALUE;
                for (int x = l; x <= r; x++) {
                    int left = (x - 1 >= l) ? dp[l][x - 1] : 0;
                    int right = (x + 1 <= r) ? dp[x + 1][r] : 0;
                    int cost = x + Math.max(left, right);
                    if (cost < best) best = cost;
                }
                dp[l][r] = (best == Integer.MAX_VALUE ? 0 : best);
            }
        }
        return dp[1][n]; 
    }
}
