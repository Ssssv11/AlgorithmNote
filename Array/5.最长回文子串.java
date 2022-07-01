package Array;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start

/*
 * 使用左右指针，但它们的起点是中点
 */
class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // s.length 为奇数
            String s1 = palindrome(s, i, i);
            // s.length 为偶数
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    // 在 s 中寻找以 s[left] 和 s[right] 为中心的最长回文串
    // 如果输入相同的 left 和 right，就相当于寻找长度为奇数的回文串
    // 如果输入相邻的 left 和 right，则相当于寻找长度为偶数的回文串。
    public String palindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // 返回以 s[left] 和 s[right] 为中心的最长回文串
        return s.substring(left + 1, right);
    }
}
// @lc code=end

