package String;
/*
 * @lc app=leetcode.cn id=1592 lang=java
 *
 * [1592] 重新排列单词间的空格
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public String reorderSpaces(String text) {
        int blankNums = 0, head = -1, tail = -1;
        List<String> words = new ArrayList();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                blankNums++;
                if (head != -1) {
                    words.add(text.substring(head, tail + 1));
                    head = -1; tail = -1;
                }
            } else {
                if (head == -1) head = i;
                tail = i;
                if (i == text.length() - 1) {
                    words.add(text.substring(head, tail + 1));
                }
            }
        }

        String bStr = blankString(blankNums / (words.size() == 1 ? 1 : words.size() - 1));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i));
            if (i != words.size() - 1) result.append(bStr);
            else result.append(blankString(text.length() - result.length()));
        }
        return result.toString();
    }

    public String blankString(int nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums; i++) sb.append(" ");
        return sb.toString();
    }
}
// @lc code=end

