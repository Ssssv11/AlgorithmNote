package Array;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start

/*
 * 
 * 子串问题 -> 滑动窗口
 * 思路：
 * 1. 在字符串 S 中使用左右指针技巧，初始化 left = right = 0，把索引左闭右开区间 [left, right) 称为一个「窗口」。
 * (也可以设计两端都开或者两端都闭的区间，但设计为左闭右开区间是最方便处理的。
 * 因为这样初始化 left = right = 0 时区间 [0, 0) 中没有元素，
 * 但只要让 right 向右移动（扩大）一位，区间 [0, 1) 就包含一个元素 0 了。
 * 如果设置为两端都开的区间，那么让 right 向右移动一位后开区间 (0, 1) 仍然没有元素；
 * 如果设置为两端都闭的区间，那么初始区间 [0, 0] 就包含了一个元素。
 * 这两种情况都会给边界处理带来不必要的麻烦。)
 * 2. 先不断地增加 right 指针扩大窗口 [left, right)，直到窗口中的字符串符合要求（包含了 T 中的所有字符）。
 * 3. 此时停止增加 right，转而不断增加 left 指针缩小窗口 [left, right)，直到窗口中的字符串不再符合要求（不包含 T 中的所有字符了）。同时，每次增加 left 都要更新一轮结果。
 * 4. 重复第 2 和第 3 步，直到 right 到达字符串 S 的尽头。
 * 第 2 步相当于在寻找一个「可行解」，然后第 3 步在优化这个「可行解」，最终找到最优解，也就是最短的覆盖子串。左右指针轮流前进，窗口大小增增减减，窗口不断向右滑动，这就是「滑动窗口」这个名字的来历。
 * 
 */
class Solution {
    public String minWindow(String s, String t) {
        // 定义窗口及所需字符的 map
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // 将 t 中字符存入 need
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            // 若 need 中存在则加 1，不存在则创建置 0 再加 1
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        // 定义左右指针
        int left = 0, right = 0;
        int count = 0;
        // 用于更新满足的窗口 window 的长度,若 len 一直是 MAX_VALUE，说明没有满足的串
        int len = Integer.MAX_VALUE;
        // 用于记录 window 串的起始位置
        int start = 0;

        // right 完整遍历 s
        while(right < s.length()) {
            char ch = s.charAt(right);
            right++;
            // 若当前字符在 need 中
            if(need.containsKey(ch)) {
                // window中存入当前字符
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                // 若当前 window 中该字符个数与 need 中该字符的个数相同
                if(window.get(ch).equals(need.get(ch))) {
                    // 已满足条件的字符数加1
                    count++;
                }
            }
            // 当所有 t 中的字符都满足
            while(count == need.size()) {
                // 若当前长度更新则更新
                if(right - left < len) {
                    start = left;
                    len = right - left;
                }

                // left 右移，缩小窗口
                char c = s.charAt(left);
                left++;

                // 若右移舍弃的字符是需要的字符
                if(need.containsKey(c)) {
                    // 若当前该字符已满足，则将 count--
                    if(window.get(c).equals(need.get(c))) {
                        count--;
                    }
                    // 更新 window
                    window.put(c, window.get(c) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
// @lc code=end

