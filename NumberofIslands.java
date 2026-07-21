class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;int count=0;
        boolean vis[][]= new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == false && grid[i][j] == '1'){
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    void bfs(int i, int j, char[][] grid, boolean[][] vis){
        vis[i][j]=true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(i,j));
        int n=grid.length;
        int m=grid[0].length;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()) {

            Pair cur = q.poll();

            for(int k = 0; k < 4; k++) {

                int nr = cur.first + dr[k];
                int nc = cur.second + dc[k];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && grid[nr][nc] == '1') {
                    vis[nr][nc] = true;
                    q.offer(new Pair(nr, nc));
                }   
            }
        }
        
    }
}
class Pair{
    int first,second;
    Pair(int first , int second){
        this.first=first;
        this.second=second;
    }
}
