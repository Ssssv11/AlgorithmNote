package BackTrack;
/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

import java.util.LinkedList;
import java.util.List;

// @lc code=start
class Solution {
    List<String> result = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backTrack(n, n, sb);
        return result;

    }
    private void backTrack(int leftCount, int rightCount, StringBuilder sb){
        //如果左括号剩下的多 说明不符合要求
        if(leftCount > rightCount) {
            return;
        }
        //括号数量最后变成了 负数 不合法
        if(leftCount < 0 || rightCount < 0) {
            return;
        }

        if(leftCount == 0 && rightCount == 0){
            //找到一种可能 将结果加入到 result 集合中
            result.add(sb.toString());
        }

        sb.append('(');
        backTrack(leftCount - 1, rightCount, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        backTrack(leftCount, rightCount - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
// @lc code=end
