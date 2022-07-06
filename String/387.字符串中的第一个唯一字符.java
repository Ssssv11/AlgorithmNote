package String;
/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start

/*
 * 统计次数可以想到使用 Hash
 * 但这里由于全是小写字母，可以用数组充当 Hash 映射的作用
 * 其中索引代表字符的 ASCII 码，值代表出现的次数
 */
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            // ch - ‘a’ 即可从 0 开始存放
            count[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(count[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

