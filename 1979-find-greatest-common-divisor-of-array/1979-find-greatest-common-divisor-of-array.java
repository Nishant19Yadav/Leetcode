class Solution {
    public int findGCD(int[] nums) {
        int min = IntStream.of(nums).min().getAsInt();
        int max = IntStream.of(nums).max().getAsInt();
        int ans=0;
        for(int i=1;i<=max;i++){
            if(min%i == 0 && max%i==0){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}