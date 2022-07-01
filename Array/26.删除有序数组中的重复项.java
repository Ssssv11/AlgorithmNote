package Array;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start

/*
 * 原地修改 -> 快慢指针
 * 数组是有序的，重复元素一定是相邻的元素
 * 使用快慢指针，每当fast找到一个不重复的元素就将值赋给slow，并让slow向前移动
 * 这样就保证了 nums[0..slow] 都是不重复的元素
 * 当fast遍历完整个数组，nums[0..slow] 就是去重后的数组
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // 定义快慢指针
        int slow = 0, fast = 0;
        // 快指针遍历数组
        while(fast < nums.length) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组长度为索引+1
        return slow + 1;
    }
}
// @lc code=end

