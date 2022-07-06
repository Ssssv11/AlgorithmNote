package String;
/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start

/*
 * 与 #387 相似，这里用数组作映射
 * 遍历 s 时遇到的字符对数组值进行加一
 * 遍历 t 时遇到的字符对数组值进行减一
 * 最后验证数组中的元素是否都为 0 即可
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        for (int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

