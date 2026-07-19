class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Integer> map = new HashMap<>();
        Set<Character> set= new HashSet<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch:s.toCharArray()){
            map.put(ch,map.get(ch)-1);

            if(set.contains(ch)) continue;

            while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())>0){
                set.remove(st.pop());
            }
            st.push(ch);
            set.add(ch);
        }
        StringBuilder res = new StringBuilder();
        for(char c:st) res.append(c);
        return res.toString();
    }
}