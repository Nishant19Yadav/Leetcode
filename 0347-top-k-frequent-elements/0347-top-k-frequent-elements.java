class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            int maxf = -1;
            int ele = 0;

            for(int key:mp.keySet()){
                if(mp.get(key)>maxf){
                    maxf= mp.get(key);
                    ele = key;
                }
            }
            ans[i] = ele;
            mp.remove(ele);
        }
        return ans;
    }
}