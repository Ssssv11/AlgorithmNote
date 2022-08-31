package Math;

/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel 表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] target = columnTitle.toCharArray();
        int res = 0;
        for(char ch : target) {
            int curNum = ch - 'A' + 1;
            res = res * 26 + curNum;
        }
        return res;
    }
}
// @lc code=end

