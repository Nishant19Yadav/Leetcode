class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return solve(n-1,amount,dp,coins);
    }
    private int solve(int idx,int target,int[][] dp,int[] coins){
        if (target == 0)
            return 1;

        if (idx == 0)
            return (target % coins[0] == 0) ? 1 : 0;

        if(dp[idx][target] != -1){
            return dp[idx][target];
        }   


        int not = solve(idx-1,target,dp,coins);
        int take = 0;
        if(coins[idx]<=target){
            take = solve(idx,target-coins[idx],dp,coins);
        }
        return dp[idx][target]=take+not;
    }
}