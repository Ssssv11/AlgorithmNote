package Math;

/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = -1;
        for (int i = 0; i < n; i++) {
            // 元素从 1 开始
            int index = Math.abs(nums[i]) - 1;
            // nums[index] 小于 0 则说明重复访问
            if (nums[index] < 0) {
                dup = Math.abs(nums[i]);
            } else {
                nums[index] *= -1;
            }
        }

        int missing = -1;
        for (int i = 0; i < n; i++) {
            // nums[i] 大于 0 则说明没有访问
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }

        return new int[] { dup, missing };
    }
}
// @lc code=end
