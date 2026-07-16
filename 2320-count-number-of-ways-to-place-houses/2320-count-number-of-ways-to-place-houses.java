class Solution {
    public static final long MOD = 1_000_000_007;
    public int countHousePlacements(int n) {
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        long k = solve(dp,n);
        long ans = (k*k)%MOD;
        return (int) ans;
    }
    private long solve(long[] dp,int n){
        if(n==0) return 1;
        if(n==1) return 2;
        if(dp[n]!=-1) return dp[n];

        dp[n] = (solve(dp,n-1)+solve(dp,n-2))%MOD;
        return dp[n];
    }
}