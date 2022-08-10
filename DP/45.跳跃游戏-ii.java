package DP;

/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0, farthest = 0;
        int jumps = 0;
    
        for(int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if(end == i) {
                jumps++;
                end = farthest;
            }
        }
        
        return jumps;
    }
}
// @lc code=end

