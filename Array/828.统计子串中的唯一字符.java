import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=828 lang=java
 *
 * [828] 统计子串中的唯一字符
 */

// @lc code=start
class Solution {
    public int uniqueLetterString(String s) {
        int ans = 0;
        int[] tmp0 = new int[26]; //存储某一个字符前一个字符所在位置
        int[] tmp1 = new int[26]; //存储某个字符当前所处位置

        Arrays.fill(tmp0, -1);
        Arrays.fill(tmp1, -1);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char now = chars[i];
            int index = now - 'A';
            if (tmp1[index] > -1) {
                ans += (i - tmp1[index]) * (tmp1[index] - tmp0[index]);
            }
            tmp0[index] = tmp1[index];
            tmp1[index] = i;
        }
        for (int i = 0; i < 26; i++) {
            if (tmp1[i] > -1) {
                ans += (tmp1[i] - tmp0[i]) * (s.length() - tmp1[i]);
            }
        }
        return ans;
    }
}
// @lc code=end

