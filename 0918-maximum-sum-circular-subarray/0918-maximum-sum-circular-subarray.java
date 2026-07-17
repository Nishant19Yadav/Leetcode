class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0],min=nums[0],cmax=nums[0],cmin=nums[0],total=nums[0];
        
        for(int i=1;i<nums.length;i++){
            cmax = Math.max(cmax+nums[i],nums[i]);
            max = Math.max(cmax,max);

            cmin = Math.min(cmin+nums[i],nums[i]);
            min = Math.min(cmin,min);

            total +=nums[i];
        }
        int csum = total -min;
        if(csum ==0){
            return max;
        }
        return Math.max(max,csum);
    }
}