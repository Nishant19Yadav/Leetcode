class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            ans.add(i);
        }
            int a = ans.poll();
            int b = ans.poll();
        return (a - 1) * (b - 1);  
    }
}