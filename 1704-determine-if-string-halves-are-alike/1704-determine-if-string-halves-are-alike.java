class Solution {

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public boolean halvesAreAlike(String s) {
        int cnt1 = 0, cnt2 = 0;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) cnt1++;
        }

        for (int i = n / 2; i < n; i++) {
            if (isVowel(s.charAt(i))) cnt2++;
        }

        return cnt1 == cnt2;
    }
}