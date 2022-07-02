package Array;

import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start

/*
 * 字串问题 -> 滑动窗口
 * 与 76 十分相似，由于需要找 s1 的排列，因此窗口的长度应与 s1 的长度相同
 * 当 count == need.size() 时就说明窗口中就是一个合法的排列，返回 true。
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int count = 0;

        while(right < s2.length()) {
            char ch = s2.charAt(right);
            right++;

            if(need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if(need.get(ch).equals(window.get(ch))) {
                    count++;
                }
            }
            
            // 当窗口大小 == s1.length()
            while(right - left == s1.length()) {
                // 且 count == need.size() 就说明该窗口符合条件
                if(count == need.size()) {
                    return true;
                }

                // 否则继续移动窗口
                char c = s2.charAt(left);
                left++;

                if(need.containsKey(c)) {
                    if(window.get(c).equals(need.get(c))) {
                        count--;
                    }
                    window.put(c, window.getOrDefault(c, 0) - 1);
                }
            }            
        }
        return false;
    }
}
// @lc code=end

