package BackTrack;
/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

import java.util.LinkedList;
import java.util.List;

// @lc code=start
class Solution {
    String[] mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res = new LinkedList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return res;
        }
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String digits, int start, StringBuilder sb) {
        if(sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }

        for(int i = start; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            for(char c : mapping[digit].toCharArray()) {
                sb.append(c);
                backtrack(digits, i + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
// @lc code=end

