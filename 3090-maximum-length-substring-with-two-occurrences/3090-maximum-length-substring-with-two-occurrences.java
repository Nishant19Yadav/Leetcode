class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] freq = new int[128];
        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right)]++;
            while (freq[s.charAt(right)] > 2) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}