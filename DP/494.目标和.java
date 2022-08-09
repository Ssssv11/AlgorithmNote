package DP;

import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start

/**
 * 回溯算法
 */
// class Solution {
//     int result = 0;

//     public int findTargetSumWays(int[] nums, int target) {
//         if(nums.length == 0) {
//             return 0;
//         }
//         backtrack(nums, 0, target, 0);
//         return result;
//     }

//     private void backtrack(int[] nums, int i, int target, int sum) {
//         // base case
//         if(i == nums.length) {
//             if(sum == target) {
//                 // 说明恰好凑出 target
//                 result++;
//             }
//             return;
//         }

//         // 给 nums[i] 选择 - 号
//         target -= nums[i];
//         // 穷举 nums[i + 1]
//         backtrack(nums, i + 1, target, sum);
//         // 撤销选择
//         target += nums[i];

//         // 给 nums[i] 选择 + 号
//         target += nums[i];
//         // 穷举 nums[i + 1]
//         backtrack(nums, i + 1, target, sum);
//         // 撤销选择
//         target -= nums[i];
//     }
// }

/**
 * 备忘录优化
 */
// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         return dp(nums, 0, target, 0);
//     }

//     // 备忘录
//     HashMap<String, Integer> memo = new HashMap<>();

//     private int dp(int[] nums, int i, int target, int sum) {
//         // base case
//         if (i == nums.length) {
//             if (sum == target) {
//                 return 1;
//             }
//             return 0;
//         }

//         // 转成字符串才能作为哈希表的键
//         String key = i + "," + sum;
//         // 避免重复计算
//         if (memo.containsKey(key)) {
//             return memo.get(key);
//         }

//         int result = dp(nums, i + 1, target, sum + nums[i]) + dp(nums, i + 1, target, sum - nums[i]);
//         memo.put(key, result);
//         return result;
//     }
// }

/**
 * 动态规划 —— 背包问题
 */
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        // 这两种情况，不可能存在合法的子集划分
        if (sum + target < 0 || (sum + target) % 2 == 1) {
            return 0;
        }
        return subsets(nums, (sum + target) / 2);
    }

    /* 计算 nums 中有几个子集的和为 sum */
    private int subsets(int[] nums, int sum) {
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        // base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j >= nums[i - 1]) {
                    // 两种选择的结果之和
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    // 背包的空间不足，只能选择不装物品 i
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    private int subsets2(int[] nums, int sum) {
        int n = nums.length;
        int[] dp = new int[sum + 1];
        // base case
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            // j 从后往前遍历
            for (int j = sum; j >= 0; j--) {
                // 状态转移方程
                if (j >= nums[i - 1]) {
                    dp[j] = dp[j] + dp[j - nums[i - 1]];
                } else {
                    dp[j] = dp[j];
                }
            }
        }
        return dp[sum];
    }

}

// @lc code=end
