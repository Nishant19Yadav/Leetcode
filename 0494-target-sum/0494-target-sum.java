class Solution {
    int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        int total =0;
        for(int i:nums){
            total += i;
        }
        if(total-target<0){
            return 0;
        }
        if((total-target)%2!=0){
            return 0;
        }
        int req = (total-target)/2;
        dp = new int[nums.length][req + 1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,nums,req);
    }
    private int solve(int idx,int sum,int[] nums,int req){
        if(sum>req) return 0;
        if(idx==nums.length){
            return sum ==req ? 1:0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }

        int take = solve(idx+1,sum+nums[idx],nums,req);
        int not =solve(idx+1,sum,nums,req);

        return dp[idx][sum] = take+not;
    }
}