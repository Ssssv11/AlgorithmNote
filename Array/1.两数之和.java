package Array;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
/*
 * 暴力解法，双指针遍历数组
 * 时间复杂度: O(N2)
 */
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int left = 0, right = 1;
//         int [] res;
//         for (left = 0; left < nums.length; left++) {
//             right = left + 1;
//             while(right < nums.length){
//                 if(nums[left] + nums[right] == target){
//                     res = new int[]{left, right};
//                     return res;
//                 }
//                 right++;
//             }
//         }
//         return res = new int[0];
//     }
// }

/*
 * 利用哈希表，将寻找 target-x 的时间复杂度降低到 O(1)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end

