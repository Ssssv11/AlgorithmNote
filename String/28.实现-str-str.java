package String;
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start

/*
 * 枚举原串 ss 中的每个字符作为「发起点」，每次从原串的「发起点」和匹配串的「首位」开始尝试匹配：
 * 匹配成功：返回本次匹配的原串「发起点」。
 * 匹配失败：枚举原串的下一个「发起点」，重新尝试匹配。
 */
class Solution {
    public int strStr(String haystack, String needle) {
        // 调用 api 直接返回
        // return haystack.indexOf(needle);
        int m = haystack.length(), n = needle.length();
        char[] hay = haystack.toCharArray(), ne = needle.toCharArray();
        // 枚举原串的「发起点」
        for (int i = 0; i <= m - n; i++) {
            // 从原串的「发起点」和匹配串的「首位」开始，尝试匹配
            int a = i, b = 0;
            while(b < n && hay[a] == ne[b]) {
                a++;
                b++;
            }
            // 如果能够完全匹配，返回原串的「发起点」下标
            if(b == n) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

