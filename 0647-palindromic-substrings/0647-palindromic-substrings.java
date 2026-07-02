class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                StringBuilder sb = new StringBuilder(a);
                String b = sb.reverse().toString();
                if(b.equals(a)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}