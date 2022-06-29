package Array;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
/*
 * 从末位开始：
 * 1. 末位加一后不为0，则表示未进位，返回
 * 2. 末位加一后为0，则末位存0，继续循环使前一位加一，返回
 * 若输入数组全为9，则循环后数组内全为0，继续执行后续语句使数组长度加一其他位置0
 */
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if(digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
// @lc code=end

