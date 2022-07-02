package Array;
/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{leftBound(nums, target), rightBound(nums, target)};
    }

    public int leftBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                // 找到 target 则向左缩小来查找左边界
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        // 由于退出条件为 left <= right， 即 left = right + 1
        // 当 target 比所有元素都大时会导致 left = nums.length + 1 的情况（一直向右查，right 一直为 nums.length）
        if(left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    public int rightBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                // 找到 target 则向右增大来查找右边界
                left = mid + 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        // 由于退出条件为 left <= right， 即 right = left - 1
        // 当 target 比所有元素都小时会导致 right = -1 的情况（一直向左收缩，left 一直为 0）
        if(right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
// @lc code=end

