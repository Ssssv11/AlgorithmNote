package String;
/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start

/*
 * 由于后一个是对于前一个的解释，因此很容易想到使用递归进行解题
 * 记录每次统计上一次结果中字符的出现次数与该字符
 * 使用 StringBuild 进行拼接
 */
class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(count);
                sb.append(s.charAt(i));
                count = 0;
            }
        }
        return sb.toString();
    }
}
// @lc code=end

