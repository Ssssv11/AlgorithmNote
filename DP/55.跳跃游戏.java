package DP;

/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return true;
        }
        // 初始化最远距离
        int farthest = nums[0];
        
        for(int i = 0; i <= farthest; i++) {
            // 在最远距离内不断计算能跳到的最远距离
            farthest = Math.max(farthest, i + nums[i]);
            if(farthest >= n - 1) {
                return true;
            }
        }

        return false;
    }
}
// @lc code=end

