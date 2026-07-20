class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int count=0;
        boolean []vis= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(i,isConnected,vis);
            }
        }
        return count;
    }

    void dfs(int i, int[][] gr,boolean[] vis){
        vis[i]=true;
        for(int j=0;j<gr.length;j++){
            if(i!=j && gr[i][j]==1 && vis[j]==false)
            dfs(j,gr,vis);
        }
    }
}
