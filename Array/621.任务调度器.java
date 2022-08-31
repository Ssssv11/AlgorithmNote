package Array;
/*
 * @lc app=leetcode.cn id=621 lang=java
 *
 * [621] 任务调度器
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        int res = -1;
        int maxCnt = 0;
        int[] arrCnt = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            arrCnt[tasks[i] - 'A']++;
        }
        for (int i = 0; i < arrCnt.length; i++) {
            if (arrCnt[i] > maxCnt) {
                maxCnt = arrCnt[i];
            }
        }
        for (int i = 0; i < arrCnt.length; i++) {
            if (arrCnt[i] == maxCnt) {
                res++;
            }
        }
        res += (n + 1) * (maxCnt - 1) + 1;
        return res > tasks.length ? res : tasks.length;
    }
}
// @lc code=end
