package Array;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1094 lang=java
 *
 * [1094] 拼车
 */

// @lc code=start

/*
 * 典型的需要使用差分数组解决
 * 需要注意 nums[] 的长度：车站编号从 0 开始，最多到 1000，最多有 1001 个车站
 * 获取到结果后判断全程是否有超过 capacity 的值即可
 */
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001];
        Diff diff = new Diff(nums);
        for (int[] trip : trips) {
            diff.calc(trip[1] - 1, trip[2] - 1, trip[0]);
        }
        return !Arrays.stream(diff.result()).anyMatch(x -> x > capacity);
    }
}

class Diff {
    private int[] diff;

    /**
     * create the diff array
     * @param nums
     */
    public Diff(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    /**
     * 
     * @param i
     * @param j
     * @param val
     */
    public void calc(int i, int j, int val) {
        diff[i] += val;
        if(j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    /**
     * 
     * @return the result of the origin array by diff[]
     */
    public int[] result() {
        int res[] = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}

// @lc code=end

