package Array;
/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        int index = 0;

        while(index <= right) {
            if(nums[index] == 0) {
                swap(nums, left++, index++);
            } else if(nums[index] == 1) {
                index++;
            } else if(nums[index] == 2) {
                swap(nums, right--, index);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

