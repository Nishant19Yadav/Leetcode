class Solution {
    public int uniqueLetterString(String s) {
        int[] last = new int[26];
        int[] slast = new int[26];

        Arrays.fill(last,-1);
        Arrays.fill(slast,-1);

        int res=0;
        int cnt=0;

        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'A';

            int a= last[idx];
            int b=slast[idx];

            cnt+=i-a-a+b;
            res+=cnt;

            slast[idx]=last[idx];
            last[idx]=i;
        }
        return res;
    }
}