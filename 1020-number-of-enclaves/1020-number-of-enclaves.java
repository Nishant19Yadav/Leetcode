class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m =grid[0].length;

        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && vis[i][0]==false){
                dfs(i,0,grid,vis);
            }
            if(grid[i][m-1]==1 && vis[i][m-1]==false){
                dfs(i,m-1,grid,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1 &&vis[0][i]==false){
                dfs(0,i,grid,vis);
            }
            if(grid[n-1][i]==1 && vis[n-1][i]==false){
                dfs(n-1,i,grid,vis);
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int i, int j,int[][] grid,boolean[][] vis ){
        int n=grid.length;
        int m =grid[0].length;

        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j]==0){
                return;
            }
            vis[i][j]=true;
            dfs(i+1,j,grid,vis);
            dfs(i-1,j,grid,vis);
            dfs(i,j+1,grid,vis);
            dfs(i,j-1,grid,vis);
    }
}