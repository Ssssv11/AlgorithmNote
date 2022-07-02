package Array;
/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// @lc code=start

/*
 * 子串问题 -> 滑动窗口
 * 这道题与 76、567 都很相似，与 567 同样维护一个定长窗口
 * 利用滑动窗口的框架很容易做出
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int count = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);
            right++;

            if(need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if(window.get(ch).equals(need.get(ch))) {
                    count++;
                }
            }

            // 当窗口大小 == p.length() 时可能会有满足要求的子串
            while(right - left == p.length()) {
                // 若 count == need.size() 则当前窗口内的子串满足要求
                if(count == need.size()) {
                    res.add(left);
                }

                char c = s.charAt(left);
                left++;

                if(need.containsKey(c)) {
                    if(window.get(c).equals(need.get(c))) {
                        count--;
                    }
                    window.put(c, window.getOrDefault(c, 0) - 1);
                }
            }
        }

        return res;
    }
}
// @lc code=end

