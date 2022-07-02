package Array;

/*
 * @lc app=leetcode.cn id=410 lang=java
 *
 * [410] 分割数组的最大值
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int m) {
        // 一般搜索区间是左开右闭的，所以 hi 要额外加一
        int lo = getMax(nums), hi = getSum(nums) + 1;
        while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        // 根据分割子数组的个数收缩搜索区间
        int n = split(nums, mid);
        if (n == m) {
            // 收缩右边界，达到搜索左边界的目的
            hi = mid;
        } else if (n < m) {
            // 最大子数组和上限高了，减小一些
            hi = mid;
        } else if (n > m) {
            // 最大子数组和上限低了，增加一些
            lo = mid + 1;
        }
    }
    return lo;
    }

        /* 辅助函数，若限制最大子数组和为 max，
        计算 nums 至少可以被分割成几个子数组 */
    int split(int[] nums, int max) {
        // 至少可以分割的子数组数量
        int count = 1;
        // 记录每个子数组的元素和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > max) {
                // 如果当前子数组和大于 max 限制
                // 则这个子数组不能再添加元素了
                count++;
                sum = nums[i];
            } else {
                // 当前子数组和还没达到 max 限制
                // 还可以添加元素
                sum += nums[i];
            }
        }
        return count;
    }

    // 计算数组中的最大值
    int getMax(int[] nums) {
        int res = 0;
        for (int n : nums)
            res = Math.max(n, res);
        return res;
    }

    // 计算数组元素和
    int getSum(int[] nums) {
        int res = 0;
        for (int n : nums)
            res += n;
        return res;
    }
}
// @lc code=end

