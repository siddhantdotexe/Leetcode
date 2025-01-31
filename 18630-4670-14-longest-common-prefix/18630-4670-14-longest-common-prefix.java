class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        int i = 0;
        StringBuilder prefix = new StringBuilder();
        while (i < minLength) {
            char pre = strs[0].charAt(i);
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != pre) {
                    return prefix.toString();
                }
            }
            prefix.append(pre);
            i++;
        }

        return prefix.toString();
    }
}
