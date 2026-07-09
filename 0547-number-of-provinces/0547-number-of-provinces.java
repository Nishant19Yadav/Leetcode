class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] vis = new int[n];
        int cnt=0;

        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,isConnected,vis);
                cnt++;
            }
        }
        return cnt;
    }
    public void dfs(int node,int[][] isConnected,int[] vis){
        vis[node]=1;
        for(int n=0;n<isConnected.length;n++){
            if(isConnected[node][n]==1 && vis[n]==0){
                dfs(n,isConnected,vis);
            }
        }
    }
}