package Array;
/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            // 查找中间
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                // mid < target 说明 target 在右半边
                left = mid + 1;
            } else if(nums[mid] > target) {
                // mid > target 说明 target 在左半边
                right = mid - 1;
            }
        }
        return -1;
    }
}
// @lc code=end

