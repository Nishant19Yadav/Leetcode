class Solution {
    public String rankTeams(String[] votes) {
        Map<Character,int[]> map = new HashMap<>();

        int n = votes[0].length();
        for(char c:votes[0].toCharArray()){
            map.put(c,new int[n]);
        }
        for(String vote:votes){
            for(int i=0;i<n;i++){
                map.get(vote.charAt(i))[i]++;
            }
        }
        List<Character> teams = new ArrayList<>(map.keySet());
        Collections.sort(teams,(a,b)->{
            int[] x = map.get(a);
            int[] y = map.get(b);
            for(int i=0;i<n;i++){
                if(x[i]!=y[i]){
                    return y[i]-x[i];
                }
                
            }
            return a-b;
        });
    StringBuilder sb = new StringBuilder();
    for(char c:teams){
        sb.append(c);
    }
    return sb.toString();
    }

}