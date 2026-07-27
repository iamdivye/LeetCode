class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        int[][] dp= new int[a][b];
        for(int i=0;i<a;i++)
        for(int j=0;j<b;j++)
        dp[i][j]=-1;
        return sol(a-1,b-1,text1,text2,dp);
    }
    int sol(int a, int b, String t1, String t2, int[][] dp){
        if(a<0 || b<0)
        return 0;
        if(dp[a][b] != -1)return dp[a][b];
        if(t1.charAt(a) == t2.charAt(b)){
            return dp[a][b]=1+sol(a-1,b-1,t1,t2,dp);
        }else{
            return dp[a][b]=Math.max(sol(a-1,b,t1,t2,dp), sol(a,b-1,t1,t2,dp));
        }
    }
}
