package Array;

/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start

/*
 * 有序数组 -> 双指针
 * 通过调节 left 和 right 来控制 sum 的大小
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 定义左右指针
        int left = 0, right = numbers.length - 1;
        // 遍历数组
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                // 索引从 1 开始
                return new int[]{left + 1, right + 1};
            } else if(sum < target) {
                // 若 sum < target 则需要 left 右移使 sum 增大
                left++;
            } else {
                // 若 sum > target 则需要 right 左移使 sum 减小
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

