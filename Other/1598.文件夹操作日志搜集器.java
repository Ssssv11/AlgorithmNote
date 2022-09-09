package Other;
/*
 * @lc app=leetcode.cn id=1598 lang=java
 *
 * [1598] 文件夹操作日志搜集器
 */

// @lc code=start
// class Solution {
//     public int minOperations(String[] logs) {
//         int res = 0;
//         for (int i = 0; i < logs.length; i++) {
//             if(logs[i].equals("./")) {
                
//             } else if(logs[i].equals("../")) {
//                 if(res >= 1) {
//                     res--;
//                 }
//             } else {
//                 res++;
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            switch (log) {
                case "./":
                    break;
                case "../":
                    res = res >= 1 ? res - 1 : res;
                    break;
                default:
                    res++;
            }
        }
        return res;
    }
}


// @lc code=end

