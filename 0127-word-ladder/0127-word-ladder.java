class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> st = new HashSet<>(wordList);
        st.remove(beginWord);
        Queue<Pair<String,Integer>> q = new LinkedList();
        q.add(new Pair<>(beginWord,1));

        while(!q.isEmpty()){
            String a = q.peek().getKey();
            int ans = q.peek().getValue();
            q.poll();

            if(a.equals(endWord)) return ans;

            for(int i=0;i<a.length();i++){
                char[] arr = a.toCharArray();
                char ori = arr[i];
                for(char ch='a';ch<='z';ch++){
                    arr[i]=ch;
                    String neww = new String(arr);
                    if(st.contains(neww)){
                        st.remove(neww);
                        q.add(new Pair(neww,ans+1));
                    }
                }
            }
        }
        return 0;
    }
}