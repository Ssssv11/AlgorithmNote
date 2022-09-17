package String;
/*
 * @lc app=leetcode.cn id=1624 lang=java
 *
 * [1624] 两个相同字符之间的最长子字符串
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] ch = new int[26];
        char[] strArr = s.toCharArray();
        Arrays.fill(ch, -1);
        int res = -1;
        for(int i = 0; i < strArr.length; i++) {
            if(ch[strArr[i] - 'a'] == -1) {
                ch[strArr[i] - 'a'] = i;
            } else {
                res = Math.max(res, i - ch[strArr[i] - 'a'] - 1);
            }
        }
        return res;
    }
}
// @lc code=end

