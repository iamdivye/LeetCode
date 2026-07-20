class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(i!=j && isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        int count=0;
        boolean vis[]= new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,adj);
            }
        }
        return count;
    }

    void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        for(Integer k : adj.get(i)){
            if(!vis[k])
            dfs(k,vis,adj);
        }
    }
}
