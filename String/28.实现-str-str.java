package String;
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        int m = haystack.length(), n = needle.length();
        char[] hay = haystack.toCharArray(), ne = needle.toCharArray();
        for (int i = 0; i <= m - n; i++) {
            int a = i, b = 0;
            while(b < n && hay[a] == ne[b]) {
                a++;
                b++;
            }
            if(b == n) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

