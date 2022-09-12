package Array;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1608 lang=java
 *
 * [1608] 特殊数组的特征值
 */

// @lc code=start
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x < n + 1; x++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] >= x) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (nums[r] >= x && x == n - r) {
                return x;
            }
        }
        return -1;
    }
}
// @lc code=end

