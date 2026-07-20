class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n =obstacleGrid.length;
        int m= obstacleGrid[0].length;

        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(0,0,obstacleGrid,dp);


    }
    private int solve(int i,int j,int[][] grid,int[][] dp){
        int n=grid.length;
        int m = grid[0].length;

        if(i>=n || j>=m) return 0;
        if(grid[i][j]==1) return 0;

        if(i==n-1 && j==m-1) return 1;
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int d= solve(i+1,j,grid,dp);
        int r = solve(i,j+1,grid,dp);
        return dp[i][j] = d+r;
    }
}