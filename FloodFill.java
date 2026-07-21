class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org= image[sr][sc];
        if(org == color)
        return image;
        dfs(image,sr,sc,color,org);
        return image;
    }
    void dfs(int[][] image,int a,int b,int color,int org){
        int n=image.length;
        int m=image[0].length;

        if(a<0 || a>=n || b<0 || b>=m)
        return;
        if(image[a][b] != org)
        return;

        image[a][b]=color;
        dfs(image,a-1,b,color,org);
        dfs(image,a+1,b,color,org);
        dfs(image,a,b-1,color,org);
        dfs(image,a,b+1,color,org);
    }
}
