package Array;
/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start

/*
 * 原地修改 -> 快慢指针
 * 与 27 相同，但当 fast 找到与 val 值不同的元素时需要先将值赋给slow，再让slow向前移动
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        // 定义快慢指针
        int slow = 0, fast = 0;
        // 快指针遍历数组
        while(fast < nums.length) {
            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        // 由于当 fast 找到与 val 值不同的元素时需要先将值赋给 slow，再让slwo前移
        // 因此 slow 所处在的位置就是下一次被赋值的位置
        // 即 slow 之前的数组已经完成业务，因此不需要+1
        return slow;
    }
}
// @lc code=end

