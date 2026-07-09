class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<k;i++){
        int freq = Integer.MIN_VALUE;
        String a = null;


        for(String key:map.keySet()){
            if(a==null || map.get(key)>freq || (map.get(key)==freq && key.compareTo(a)<0)) {
                freq = map.get(key);
                a=key;
            }
        }
        ans.add(a);
        map.remove(a);
        }
        return ans;

    }
}