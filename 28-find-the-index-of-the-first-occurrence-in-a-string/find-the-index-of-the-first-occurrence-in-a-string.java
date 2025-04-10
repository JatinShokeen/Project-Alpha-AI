class Solution {
    public int strStr(String haystack, String needle) {

       int m = haystack.length(), n = needle.length();
        if (n == 0) return 0;

        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1; 
    }
}