package Array;

/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start

/*
 * 原地修改 -> 双指针
 * 使用左右指针交换首尾字符串
 */
class Solution {
    public void reverseString(char[] s) {
        // 定义左右指针
        int left = 0, right = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
// @lc code=end

