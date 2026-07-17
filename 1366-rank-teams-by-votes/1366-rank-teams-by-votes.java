class Solution {
    public String rankTeams(String[] votes) {
        int n = votes[0].length();
        int[][] cnt = new int[26][26];

        for(String vote:votes){
            for(int pos=0;pos<n;pos++){
                char team = vote.charAt(pos);
                cnt[team-'A'][pos]++;
            }
        }
        Character[] teams = new Character[n];
        for (int i = 0; i < n; i++) {
            teams[i] = votes[0].charAt(i);
        }

        Arrays.sort(teams,(a,b)->{
            for(int pos=0;pos<n;pos++){
                if(cnt[a-'A'][pos]!=cnt[b-'A'][pos]){
                    return cnt[b-'A'][pos]-cnt[a-'A'][pos];
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