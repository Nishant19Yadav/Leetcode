class Solution {
    public int minDeletions(int[] nums) {
        int prev=0;
        int dlt=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==prev){
                dlt++;
            }
            else{
                prev=nums[i];
            }
        }
        return dlt;
    }
}