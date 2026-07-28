class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }

        int target = sum/2;

        Boolean[][] dp = new Boolean[nums.length][target+1];
        return solve(0,target,nums,dp);


    }
    public boolean solve(int idx,int target,int nums[],Boolean[][] dp){
        if(target==0) return true;
        if(idx==nums.length || target<0){
            return false;
        }
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        boolean take = solve(idx+1,target-nums[idx],nums,dp);
        boolean not = solve(idx+1,target,nums,dp);
        
        return dp[idx][target]= take||not;
    }
}