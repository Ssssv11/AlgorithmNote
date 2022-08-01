package DP;
/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
// class Solution {
//     public int maxSubArray(int[] nums) {
//         if(nums.length == 0) {
//             return 0;
//         }
//         int[] dp = new int[nums.length];

//         // base case 
//         // 第一个元素前面没有子数组
//         dp[0] = nums[0];

//         // 状态转移方程
//         for(int i = 1; i < nums.length; i++) {
//             dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
//         }

//         int res = Integer.MIN_VALUE;
//         for(int num : dp) {
//             res = res > num ? res : num;
//         }
//         return res;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        // base case 
        // 第一个元素前面没有子数组
        int prev = nums[0];
        int curr = 0, res = prev;

        // 状态转移方程
        for(int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], nums[i] + prev);
            prev = curr;
            res = Math.max(res, prev);
        }
        
        return res;
    }
}
// @lc code=end

