class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = Frequency(s.toLowerCase());
        int[] freq2 = Frequency(t.toLowerCase());
        return Arrays.equals(freq1, freq2);
    }
    static int[] Frequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

}