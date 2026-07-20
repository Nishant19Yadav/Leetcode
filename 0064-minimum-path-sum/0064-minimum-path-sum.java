class Solution {
    public int minPathSum(int[][] grid) {
        int n= grid.length;
        int m =grid[0].length;

        int[][] dp =new int[n][m];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return solve(0,0,dp,grid);

    }
    private int solve(int i,int j,int[][] dp,int[][] grid){

        int n = grid.length;
        int m = grid[0].length;

        if(i>=n || j>=m) return Integer.MAX_VALUE;
         if(i==n-1 && j==m-1) return grid[i][j];

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = solve(i+1,j,dp,grid);
        int right = solve(i,j+1,dp,grid);
        int ans = Math.min(down,right);
        if(ans==Integer.MAX_VALUE) return dp[i][j] = Integer.MAX_VALUE;

        return dp[i][j]= grid[i][j]+ans;
    }
}