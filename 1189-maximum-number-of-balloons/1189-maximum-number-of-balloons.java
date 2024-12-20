class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }
        int bCount = freq['b' - 'a'];
        int aCount = freq['a' - 'a'];
        int lCount = freq['l' - 'a'] / 2;
        int oCount = freq['o' - 'a'] / 2;
        int nCount = freq['n' - 'a'];

        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }
}