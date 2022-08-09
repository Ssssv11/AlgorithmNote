package DP;

/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 和为奇数时，不可能划分成两个和相等的集合
        if (sum % 2 != 0) {
            return false;
        }
        int n = nums.length;
        sum /= 2;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        // base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - nums[i - 1] < 0) {
                    // 装不下
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }
}

/**
 * 优化空间复杂度
 */
// class Solution {
//     public boolean canPartition(int[] nums) {
//         int sum = 0;
//         for (int num : nums) {
//             sum += num;
//         }
//         // 和为奇数时，不可能划分成两个和相等的集合
//         if (sum % 2 != 0) {
//             return false;
//         }
//         int n = nums.length;
//         sum /= 2;
//         boolean[] dp = new boolean[sum + 1];

//         // base case
//         dp[0] = true;

//         for(int i = 0; i < n; i++) {
//             for(int j = sum; j >= 0; j--) {
//                 if(j - nums[i] >= 0) {
//                     dp[j] = dp[j] || dp[j - nums[i]];
//                 }
//             }
//         }

//         return dp[sum];
//     }
// }
// @lc code=end
