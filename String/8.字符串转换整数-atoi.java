package String;
/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }
        if(!Character.isDigit(s.charAt(0))
            && s.charAt(0) != '-' 
            && s.charAt(0) != '+') {
            return 0;
        }
        long res = 0l;
        boolean flag = s.charAt(0) == '-';
        int i = !Character.isDigit(s.charAt(0)) ? 1 : 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i++) - '0');
            if (!flag && res > Integer.MAX_VALUE) {
                res = Integer.MAX_VALUE;
                break;
            }
            if (flag && res > 1L + Integer.MAX_VALUE) {
                res = 1L + Integer.MAX_VALUE;
                break;
            }
        }
        return flag ? (int) -res : (int) res;
    }
}
// @lc code=end

