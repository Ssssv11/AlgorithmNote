package Array;

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
/*
 * 遍历数组，将非零值从0开始放置
 * 剩余位置填0
 */
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int index = 0;
//         for (int i : nums) {
//             if(i != 0) {
//                 nums[index] = i;
//                 index ++;
//             }
//         }
//         for (int i = index; i < nums.length; i++) {
//             nums[i] = 0;
//         }
//     }
// }

/*
 * 双指针解法
 * 左指针指向处理好的序列尾部，右指针指向还未处理的序列的头部
 * 右指针不断右移，当遇到非零数时就将该数与左指针指向位置的数交换
 * 同时左指针右移
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while(right < nums.length) {
            if(nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
// @lc code=end

