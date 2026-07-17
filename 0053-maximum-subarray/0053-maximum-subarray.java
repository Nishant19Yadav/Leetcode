class Solution {
    public int maxSubArray(int[] nums) {
        int prev = nums[0];
        int max =nums[0];
        for(int i=1;i<nums.length;i++){
            int curr = Math.max(prev+nums[i],nums[i]);
            prev =curr;
            max = Math.max(max,curr);
        }
        return max;
    }

}
//tabulation
