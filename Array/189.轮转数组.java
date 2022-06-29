package Array;

/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int [] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i + k <= nums.length-1) {
                newNums[i + k] = nums[i];
            } else {
                newNums[k + i - nums.length] = nums[i];
            }
        }
        System.arraycopy(newNums, 0, nums, 0, newNums.length);
    }
}
// @lc code=end

