package String;
/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 当字符串数组长度为 0 时则公共前缀为空，直接返回
        if(strs.length == 0) {
            return "";
        }
        // 令最长公共前缀 res 的值为第一个字符串，进行初始化
        String res = strs[0];
        // 遍历后面的字符串，依次将其与 res 进行比较，两两找出公共前缀，最终结果即为最长公共前缀
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < res.length(); j++) {
                if(res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            // 如果查找过程中出现了 res 为空的情况，则公共前缀不存在直接返回
            if(res.equals("")) {
                return res;
            }
        }
        return res;
    }
}
// @lc code=end

