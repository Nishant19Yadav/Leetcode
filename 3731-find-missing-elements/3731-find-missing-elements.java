class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = IntStream.of(nums).min().getAsInt();
        int max = IntStream.of(nums).max().getAsInt();

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();

        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}