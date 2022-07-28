package Math;

/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start

/*
 * 使用哈希表
 */
// class Solution {
//     public int missingNumber(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             set.add(nums[i]);
//         }
//         for (int i = 0; i <= nums.length; i++) {
//             if(!set.contains(i)) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

/*
 * 不使用额外空间
 */
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        // 先和新补的索引异或
        res ^= n;
        // 和其他的元素、索引做异或
        for (int i = 0; i < n; i++) {
            res ^= i ^ nums[i];
        }
        return res;
    }
}
// @lc code=end

