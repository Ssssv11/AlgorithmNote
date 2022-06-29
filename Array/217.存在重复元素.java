package Array;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start

/*
 * 双指针遍历比较，笨方法
 */
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int right = 0;
//         for (int left = 0; left < nums.length; left++) {
//             right = left + 1;
//             while(right < nums.length) {
//                 if(nums[left] == nums[right]) {
//                     return true;
//                 } else {
//                     right++;
//                 }
//             }
//         }
//         return false;
//     }
// }

/*
 * 先排序，再比较相邻两数是否相等
 */
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

/*
 * 通过哈希判读是否相等：相同值会被存到相同位置的哈希表中
 * HashSet.add() ->
 * Returns: true if this set did not already contain the specified element
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

