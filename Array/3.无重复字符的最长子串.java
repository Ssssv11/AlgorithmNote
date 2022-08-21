package Array;
/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2) {
            return n;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < n; i++) {
            // 判断是否有重复的元素，如果有重复的元素，就更新j的值
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            // 把 i 指向的值存储到 map 中
            map.put(s.charAt(i), i);
            //更新 j 到 i 之间的最大距离，也就是无重复字符的最长子串
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
// @lc code=end

