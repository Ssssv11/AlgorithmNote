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
 * 原地操作 -> 双指针解法
 * 左指针指向处理好的序列尾部，右指针指向还未处理的序列的头部
 * 右指针不断右移，当遇到非零数时就将该数与左指针指向位置的数交换
 * 同时左指针右移
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length) {
            if(nums[fast] != 0) {
                swap(nums, slow, fast);
                slow++;
            }
            fast++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

/*
 * 还可以使用 27 中的 removeElement() 方法
 * 先去除 0，再向除去后的数组的后面的元素置 0
 */
// class Solution {
//     public void moveZeroes(int nums[]) {
//         int index = removeElement(nums, 0);
//         for ( ; index < nums.length; index++) {
//             nums[index] = 0;
//         }
//     }

//     public int removeElement(int[] nums, int val) {
//         int slow = 0, fast = 0;
//         while(fast < nums.length) {
//             if(nums[fast] != val) {
//                 nums[slow] = nums[fast];
//                 slow++;
//             }
//             fast++;
//         }
//         return slow;
//     }
// }
// @lc code=end

